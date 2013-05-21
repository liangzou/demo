package com.huawei;

/**
 * @author leon(liangzou0318@gmail.com)
 * @date 2013-4-26
 * @filaname BiggerThanAverage.java
 */
public class BiggerThanAverage {
     public static int avgnum(int[] s){
    	 int sum=0;
    	 int count=0;
    	  for(int i=0;i<s.length;i++){
    		  sum+=s[i];
    	  }
    	  System.out.println(sum/s.length);
    	  for(int i=0;i<s.length;i++){
    		  
    		  if(s[i]>sum/s.length){
    			  count++;
    		  }
    	  }
    	 return count;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] a={1,2,3,4,5,6,7,8,9};
        System.out.println(avgnum(a)+"   "+(float)1/2);
	}

}
