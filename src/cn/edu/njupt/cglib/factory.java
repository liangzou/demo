package cn.edu.njupt.cglib;

import net.sf.cglib.beans.BeanCopier;
import net.sf.cglib.proxy.Enhancer;

public class factory {
	//private CglibTest ct=new CglibTest();
	public CglibTest getInstance(AuthProxy name){
		//BeanCopier
		Enhancer en=new Enhancer();
		en.setSuperclass(CglibTest.class);
		en.setCallback(name);
		System.out.println("weg"+en.create());
		return (CglibTest) en.create();
	}
}
