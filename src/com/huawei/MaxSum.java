package com.huawei;

/**
 * @author leon(liangzou0318@gmail.com)
 * @date 2013-4-27
 * @filaname MaxSum.java
 */
public class MaxSum {
    public static int maxsum(int[] a){
    	int sum=a[0];
    	int tempsum=0;
    	for(int i=0;i<a.length;i++){
    		if(tempsum<=0){
    			tempsum=a[i];
    			//System.out.println(a[i]);
    		}
    		else  tempsum+=a[i];
    		if(tempsum>sum){
    			sum=tempsum;
    			System.out.println(sum);
    		}
    	}
    	
    	return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] a={-3,-3,4,6,-6,4,3,-5,2};
      System.out.println(maxsum(a));
	}

}
