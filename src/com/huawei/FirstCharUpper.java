package com.huawei;

/**
 * @author leon(liangzou0318@gmail.com)
 * @date 2013-4-27
 * @filaname FirstCharUpper.java
 */
public class FirstCharUpper {
    public static int firstUpper(String a){
    	 int count=0;
    	for(int i=0;i<a.length();i++){
    		if(a.charAt(i)>='A'&&a.charAt(i)<='E'){
    			int as='a';
    			System.out.println((int)as);
    			count++;
    		}
    	}
    	return count;
    }
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a="EfwefwEf";
       System.out.println(firstUpper(a));
	}

}
