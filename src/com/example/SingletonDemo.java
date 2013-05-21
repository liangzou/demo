package com.example;

public class SingletonDemo {
    private static SingletonDemo st=new SingletonDemo();
    public static SingletonDemo getInstance(){
    	return st;
    }
    public static void main(String[] args){
    	
    	SingletonDemo s1=getInstance();
    	SingletonDemo s2=getInstance();
    	System.out.println(s1==s2);
    	
    }
}
