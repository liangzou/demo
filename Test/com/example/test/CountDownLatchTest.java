package com.example.test;

import java.util.concurrent.CountDownLatch;

import org.junit.Test;

import com.example.CountDownLatchDemo;
import com.example.CountDownLatchDemoWorker;

public class CountDownLatchTest {

	@Test
	public void testTimetask() throws InterruptedException {
		CountDownLatchDemo cdt=new CountDownLatchDemo();
		CountDownLatchDemoWorker cdtw=new CountDownLatchDemoWorker();
		long time=cdt.timetask(10, cdtw);
		System.out.print(time);
	}
	@Test
	public void testwork(){
		CountDownLatch begin=new CountDownLatch(1);
		CountDownLatch end=new CountDownLatch(6);
		CountDownLatchDemo cdl=new CountDownLatchDemo(6, begin, end);
		
		cdl.work();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cdl.Test();
	}

}
