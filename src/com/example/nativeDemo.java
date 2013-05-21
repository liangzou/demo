package com.example;

public class nativeDemo {
	public native void hello();
	
	static {  
        System.loadLibrary("HelloWorldImpl");  
    } 
	
	public static void main(String[] args){
		nativeDemo nd=new nativeDemo();
		nd.hello();
	}

}
