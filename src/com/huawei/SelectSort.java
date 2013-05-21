package com.huawei;

/**
 * @author leon(liangzou0318@gmail.com)
 * @date 2013-5-5
 * @filaname BinarySearchSort.java
 */
public class SelectSort {
    public static int[] sort(int[] a){
    	int k=0;
    	for(int i=0;i<a.length;i++){
    		k=i;
    		for(int j=i+1;j<a.length;j++){
    			if(a[j]<a[k]){
    				k=j;
    			}
    		}
    		if(k!=i){
    			int temp=a[i];
    			a[i]=a[k];
    			a[k]=temp;
    		}
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
