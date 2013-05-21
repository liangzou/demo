package com.example;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintWriterDemo {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
     PrintWriter pw=new PrintWriter(new DataOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\1.txt")));
     pw.println("a");
     System.out.println("fw");
     
     pw.print("fwefew");
     pw.close();
	}

}
