package com.huawei;

/**
 * @author leon(liangzou0318@gmail.com)
 * @date 2013-5-5
 * @filaname ShellSort.java
 */
public class ShellSort {
    public static Integer[] sort(Integer[] a){
    	int gap=a.length/2;
    	int k;
    	for(int i=gap;i>0;i/=2){
    	  for(int j=i;j<a.length;j++){
    		int temp=a[j];
    		for(k=j;k>=i&&temp<a[k-i];k=k-i){  //²åÈëÅÅÐò
    			a[k]=a[k-i];
    		}
    		a[k]=temp;
    	  }
    	}
    	return a;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a={12,5,7,8,34,9,4,2,65,7,54};
		Integer[] b=sort(a);
        for(int i=0;i<b.length;i++){
        	System.out.print(b[i]+" ");
        }
	}

}
