package com.example;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DateInputStreamDemo {
	public static void main(String args[]){
	File f=new File("F:/logs/log.log");
	int a=0;
	String str="abc";
	String bs=null;
	Integer[] c=new Integer[1000];
	int size=0;
	 //a=int[]{1,3}; 
	Byte[] b=new Byte[1000];
	/*
	try {
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("F:/logs/1.txt"));
		try {
			dos.writeUTF(str);
			//dos.write(a);
            System.out.println(dos.size());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generat
	}*/
		  try {
		FileInputStream fis=new FileInputStream(f);
		DataInputStream dis=new DataInputStream(fis);
		BufferedInputStream bis=new BufferedInputStream(dis);
		
			
			try {
				
				
				//System.out.println(a>21?1:2);
				//dis.read(b);
			//	bis.read() ;
				/*for(int i=0;i<1000&&(a=bis.read())!=-1;i++){
					System.out.println(a);
				}*/
				int i=0;
				while((a=bis.read())!=-1){
					System.out.print((char)a);
					c[i++]= a;
					size=c.length-1;
				}
				/*for(int j=0;j<b.length;j++){
					System.out.print((char)b[j]);
				}*/
			//a=bis.read();
				 //bs=dis.readLine();
			//	System.out.println(a);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		  try {
				DataOutputStream dos=new DataOutputStream(new FileOutputStream("F:/logs/1.txt"));
				try {
					//dos.writeUTF(str);
					//dos.writeBytes(b);
					System.out.println(size+" ds");
					for(int k=0;k<size-1;k++){
					dos.write((char)(int)c[k]);}
		            System.out.println(dos.size());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generat
			}
	}
}
