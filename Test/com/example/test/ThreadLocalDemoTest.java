package com.example.test;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import org.junit.Test;
import org.junit.internal.ArrayComparisonFailure;

import com.example.ThreadLocalDemo;

public class ThreadLocalDemoTest {

	@Test
	public void testCall() throws ArrayComparisonFailure, Exception {
		//ThreadLocalDemo tl=new ThreadLocalDemo(); 
		ExecutorService es=Executors.newFixedThreadPool(5);
		 ArrayList<Future<String>> results=new ArrayList<Future<String>>();
		 Character aa='\u90B9';
		 
		for(int i=0;i<5;i++){
			FutureTask ft=new FutureTask(new ThreadLocalDemo("a"+i));			
			//Future<String> f=(Future<String>) es.submit(ft);
			es.submit(ft);
			results.add(ft);
		}
	//	assertArrayEquals("OK", "hello callable".getBytes(), tl.call().getBytes());
		
		
			 Thread.sleep(2000);
		  for(Future<String> a: results){
			if(a.isDone()){
			System.out.println(a.get()+" "+aa.toString());                
			}
			else{
				System.out.println("no");
			}
		}
	
	
	}
	@Test
	public void TestTimeUnit(){
		ThreadLocalDemo tl=new ThreadLocalDemo("timeubit");
		tl.timeunit();
	}
	
	@Test
	public void TestReentrance(){
		ThreadLocalDemo t2=new ThreadLocalDemo();
		t2.reentrance();
	}
	}

