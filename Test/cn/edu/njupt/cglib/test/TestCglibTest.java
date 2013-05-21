package cn.edu.njupt.cglib.test;

import org.junit.Test;

import cn.edu.njupt.cglib.AuthProxy;
import cn.edu.njupt.cglib.CglibTest;
import cn.edu.njupt.cglib.factory;

public class TestCglibTest {
 
	 @Test
	 public void createTest(){
		 factory f=new factory();
		 CglibTest cb=f.getInstance(new AuthProxy("a") );
		 cb.create();				 
	 }
}
