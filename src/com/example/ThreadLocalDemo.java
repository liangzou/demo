package com.example;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class ThreadLocalDemo implements Callable<String>{
    //ThreadLocal t=new ThreadLocal();
    TimeUnit tu=TimeUnit.SECONDS;
	transient int a=3;
    static int m=3;
	private String name;
	public ThreadLocalDemo(){
		
	}
	public ThreadLocalDemo(String name){
		this.name=name;
	}
	@Override
	public  String call() throws Exception {
		TimeUnit.SECONDS.sleep(1);
		// TODO Auto-generated method stub
		return "hello callable"+name;
		
	}
	public void timeunit(){
		Thread t=new Thread(){
			
			public void run(){	
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("timeUnit");
			}
		};
	//	t.start();
		try {
		
			t.start();
			tu.timedJoin(t, 5);//相当与join，这里t是执行的线程，而5是指最大等候5s，如果线程t执行超过5，不在等候
			System.out.println("main");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	synchronized public void reentrance(){
		//LinkedBlockingDeque<E> l=new LinkedBlockingDeque<E>();
	    
		if(m>=0){
			System.out.println("reentrance "+m+"  "+a);
			m--;
			reentrance();
		}
	}
}
