package com.example;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
  private int id;
private CountDownLatch begin;
private CountDownLatch end;
private int nThread;
 public CountDownLatchDemo(){};

public long timetask(int nThread,final Runnable task) throws InterruptedException{
	  final CountDownLatch startGate=new CountDownLatch(1);
	  final CountDownLatch endGate=new CountDownLatch(nThread);
	  for(int i=0;i<nThread;i++){
		  Thread t=new Thread(){
			  public void run(){
				  try {
					  System.out.println(System.currentTimeMillis()+"  "+startGate.getCount()+"  "+endGate.getCount());
					startGate.await();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  try {
					task.run();
					System.out.println(System.currentTimeMillis()+"#"+startGate.getCount());
				} finally{
					endGate.countDown();
				}
				}			  
		  };
		  t.start();
	  }
	  long start=System.nanoTime();
	  startGate.countDown();
	  endGate.await();
	  long end=System.nanoTime();
	  
	return end-start;
	  
  }
  
   public CountDownLatchDemo(int nThread,CountDownLatch begin,CountDownLatch end){
	    this.nThread=nThread;
	    this.begin=begin;
	    this.end=end;
  }
   
   public void work(){
	   for(int i=0;i<nThread;i++){
		   new Thread(){
			   public void run(){
				   System.out.println("start before await()");
				   try {
					  begin.await();
					  
				   } catch (InterruptedException e) {
					// TODO Auto-generated catch block
				 	e.printStackTrace();
				   }finally{
					   end.countDown();
					  // System.out.println("have started after await(%%%%");
				   }
				   
				   System.out.println("have started after await()");
			   }
		   }.start();
	   }
   }
   public void Test(){
	   begin.countDown();
	   try {
		end.await();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   System.out.println("work have finished!");//等到之前的线程结束之后完成
	   
   }
}
