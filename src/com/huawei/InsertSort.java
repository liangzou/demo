package com.huawei;

/**
 * @author leon(liangzou0318@gmail.com)
 * @date 2013-5-5
 * @filaname InsertSort.java
 */
public class InsertSort {
    public static int[] sort(int[] a){
    	for(int i=0;i<a.length;i++){
    		int temp=a[i];
    		int k=i;   		
    			while(k>0&&temp<a[k-1]){
    				a[k]=a[k-1];
    				k--;
    			}  		
    		    a[k]=temp;
    	}
    	return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={12,5,7,8,34,9,4,2,65,7,54};
		int[] b=sort(a);
        for(int i=0;i<b.length;i++){
        	System.out.print(b[i]+" ");
        }
	}

}
