package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServerDemo {
	
	private ServerSocket ss;
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	public NetServerDemo(){
	
	 try {
		ss = new ServerSocket(10100);
	
	 while (true){
		// System.out.println("fwe");
	   socket = ss.accept();
	   in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	   out = new PrintWriter(socket.getOutputStream(),true);
	   String line = in.readLine();
	   //out.println("you input is :" + line);
	   System.err.println("server :"+line);
	   
	   out.close();
	   in.close();
	   socket.close();
	  }
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	}
	public static void main(String[] args)
	{
	
		new NetServerDemo();

	}
	}


