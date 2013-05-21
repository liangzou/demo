package com.example;

// $Id: Example7.java,v 1.2 2001/07/02 16:44:21 pcharles Exp $

/***************************************************************************
 * Copyright (C) 2001, Patrick Charles and Jonas Lehmann                   *
 * Distributed under the Mozilla Public License                            *
 *   http://www.mozilla.org/NPL/MPL-1.1.txt                                *
 ***************************************************************************/





import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import jpcap.JpcapCaptor;
import jpcap.NetworkInterface;
import jpcap.NetworkInterfaceAddress;
import jpcap.PacketReceiver;
import jpcap.packet.Packet;
import jpcap.packet.TCPPacket;
public class cc{
	
	
	public native void filter();
	
	public static void main(String[] args) throws IOException{
	NetworkInterface[] devices = JpcapCaptor.getDeviceList();
	System.out.println(devices.length);
	cc c=new cc();
	Packet mun=new Packet() ;
	
	
	
	for (int i = 0; i < devices.length; i++) {
		
		  //print out its name and description
		  System.out.println(i+": "+devices[i].name + "(" + devices[i].description+")");

		  //print out its datalink name and description
		  System.out.println(" datalink: "+devices[i].datalink_name + "(" + devices[i].datalink_description+")");

		  //print out its MAC address
		  System.out.print(" MAC address:");
		  for (byte b : devices[i].mac_address)
		    System.out.print(Integer.toHexString(b&0xff) + ":");
		  System.out.println();

		  //print out its IP address, subnet mask and broadcast address
		  for (NetworkInterfaceAddress a : devices[i].addresses)
		    System.out.println(" address:"+a.address + " " + a.subnet + " "+ a.broadcast);
		}
	JpcapCaptor captor=JpcapCaptor.openDevice(devices[3], 65535, false, 20000);
	System.err.println(captor);
	mun=captor.getPacket();
	
	System.err.println(mun.len);
	if(mun.len!=0){
		// JpcapWriter writer=JpcapWriter.openDumpFile(captor,"C:\\Users\\Administrator\\Desktop\\log");
	   captor.processPacket(100, c.new PacketPrinter(){
		   public void receivePacket(Packet packet) {
			  // System.out.println(packet.header);
			    //just print out a captured packet			 			   
			  try {
				  /*BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\log") );
					while((p=br.readLine())!=null){
						System.out.println(packet.toString());
					}*/
				  //BufferedReader re;
			//	BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\log"));
				  if(packet.getClass().equals(TCPPacket.class)){
					  TCPPacket tcp=(TCPPacket)packet;
					  
				   
				  BufferedWriter bf=new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\log",true) );
				
				//bos.write(packet.data);
				  System.out.println(tcp.toString());
				bf.write(tcp.toString());
			
				bf.write("\n");
				bf.close();
				  }
				//bf.
				//System.out.println(packet.toString());
				//System.out.println(packet.toString().length());
				//bos.close();
				String p=null;
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			  }
	   });
	   captor.close();
	}
	else{
		System.out.println("no packet");
	}
	}
	
	
	public class PacketPrinter implements PacketReceiver {
		  //this method is called every time Jpcap captures a packet
		  public void receivePacket(Packet packet) {
		    //just print out a captured packet
		    //System.out.println(packet);
		  }
		}
}