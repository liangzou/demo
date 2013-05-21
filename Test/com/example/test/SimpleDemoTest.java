package com.example.test;

import static org.junit.Assert.fail;

import java.lang.reflect.Method;

import junit.framework.Assert;

import org.junit.Test;

import com.example.SimpleDemo;

public class SimpleDemoTest {
   
	
	@Test
	public void testCompute() {
		SimpleDemo sd=new SimpleDemo();
		int c=sd.compute(2, 7);
		System.out.print(c);
		Assert.assertEquals(8, c);
	}
	@Test
	public void testatom() throws SecurityException, NoSuchMethodException{
		SimpleDemo sd=new SimpleDemo();
		Method[] m=SimpleDemoTest.class.getMethod("testatom")
		           .getAnnotation(Test.class).getClass().getMethods();
		for(int i=0;i<m.length;i++){
			System.err.println(m[i]);
		}
		//System.out.print(sd.atom());
		//System.out.println(SimpleDemoTest.class.getMethod("testatom")
				          // .getAnnotation(Test.class).getClass().getMethods());
	}

}
