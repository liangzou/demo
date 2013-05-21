package cn.edu.njupt.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class AuthProxy implements MethodInterceptor {
    public AuthProxy(String name) {
		super();
		this.name = name;
	}
	String name;
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		if("a".equals(name)){
			System.out.println("arg3:"+arg3);
			return arg3.invokeSuper(arg0, arg2);
		}
		else{
			System.out.println("No priviledge");
			return null;	
		} 
	}

}
