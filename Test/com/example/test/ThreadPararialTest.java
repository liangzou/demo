package com.example.test;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.example.ThreadPararial;

public class ThreadPararialTest {
    
	@Test
	public void printparaialltest() {
		long start=System.currentTimeMillis();
		//LinkedBlockingQueue workQueue =new LinkedBlockingQueue();
		ThreadPararial tp=new ThreadPararial();
		ExecutorService es=Executors.newFixedThreadPool(3);
		//ThreadPoolExecutor es=new ThreadPoolExecutor(5,12,1,TimeUnit.SECONDS,workQueue);	
		tp.printparaiall(es);	
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		
	}
	@Test
	public void printchuantest() throws InterruptedException{
		long start=System.currentTimeMillis();
		//LinkedBlockingQueue workQueue =new LinkedBlockingQueue();
		ThreadPararial tp=new ThreadPararial();
		tp.printchuan();	
		long end=System.currentTimeMillis();
		System.out.println(end-start+" "+Runtime.getRuntime().availableProcessors());
		
	}
	@Test
	public void testcyclicBarrier(){
		CyclicBarrier cb=new CyclicBarrier(6);
		ThreadPararial tp=new ThreadPararial(cb);
		tp.cyclicBarrier(cb.getParties());
		
	}

}
