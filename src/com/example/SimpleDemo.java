package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

public  class SimpleDemo {
	// final int t;
	// PseudoRandom p=new PseudoRandom();
	//	private final V[] buf;
	AtomicInteger ai=new AtomicInteger(3);
  // ConcurrentLinkedQueue
	//CountDown
	//ThreadPoolExecutor
	ExecutorService ess=Executors.newFixedThreadPool(3);
   public int compute(int b,int c){
	   int a=b^c;
	  // t=3;
	   return a;
   }
   
   public int atom(){
	   /*if(ai.compareAndSet(3, 4))
	    * S
		   return ai.get();*/
	  String a="ABCºÃ";
      char a1=a.charAt(3);
      int t=a1 & 0xff00;
	  System.out.println(a.length()+"  "+t);
	  return ai.compareAndSet(3, 4) ? ai.get():ai.get()+3;	   	   
   }
   
   /*public void charDemo(){
	   
   }*/
}
