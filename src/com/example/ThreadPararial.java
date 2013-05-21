package com.example;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import org.apache.log4j.PropertyConfigurator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//import org.apache.commons.logging.Log;

public class ThreadPararial {
	//Logger LOG=Logger.getLogger(ThreadPararial.class);
	
	Log LOG=LogFactory.getLog(ThreadPararial.class);
	private CyclicBarrier cb;
	private Runnable r;

	public ThreadPararial(){};
    public ThreadPararial(CyclicBarrier cb){
    	this.cb=cb;
    	
    };
     public void print(){
    	 //Thread.sleep(2000);
		System.out.println("hell");
    	 
    	 
     }
     public void printparaiall(Executor exec){
    	 for(int i=0;i<10;i++){
    		 exec.execute(new Runnable(){
    			 public void run(){
    				 print();
    			 }
    		 });
    	 }
     }
     public void printchuan() throws InterruptedException{
    	 for(int i=0;i<10;i++){
    		 print();
    	 }
     }
     
     public void cyclicBarrier(int nThread){
    	 for(int i=0;i<nThread;i++){
    		 new Thread(){
    		 public void run(){
    			 //System.out.println("start i");
    			 LOG.debug("start i");
    			 try {
					cb.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			 //System.out.println("end i");
    			 LOG.debug("end i");
    		 }
    	 }.start();
    	 }
     }
}
