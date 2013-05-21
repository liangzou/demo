package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class NetClientDemo {
	
	
	Socket socket;
	BufferedReader in;
	PrintWriter out;
	public NetClientDemo()
	{
	try
	{
	socket = new Socket("10.10.136.145", 10100);
	in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	
	out = new PrintWriter(socket.getOutputStream(),true);
	BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
	//out.println(line.readLine());
	System.err.println("you input is :" + line.readLine());
	line.close();
	
	out.close();
	in.close();
	socket.close();
	}
	catch (IOException e)
	{}
	}
	public static void main(String[] args)
	{
	new NetClientDemo();
	}
	}


