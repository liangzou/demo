package com.huawei;

/**
 * @author leon(liangzou0318@gmail.com)
 * @date 2013-4-26
 * @filaname FastSort.java
 */
public class QuickSort {
    public static int[] sort(int[] a,int start,int end){
    	if(start<end){
    	int t=a[start];
    	int i=start;
    	int j=end;
    	while(i<j){
    	 while(a[j]>=t&&j>i) j--;
    	 if(i<j) a[i++]=a[j];
    	 while(a[i]<t&&i<j) i++;
    	 if(i<j) a[j--]=a[i];   	   		    	   
    	}
    	a[i]=t;  
    	System.out.println(start);
       	sort(a,start,i-1);
    	sort(a,i+1,end);
    	}
    	return a;
    	
    }	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a={12,5,7,8,34,9,4,2,65,7,54};
        int[] b=sort(a,0,a.length-1);
        for(int i=0;i<b.length;i++){
        	System.out.print(b[i]+" ");
        }
	}

}
