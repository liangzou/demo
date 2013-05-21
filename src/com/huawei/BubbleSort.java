package com.huawei;

/**
 * @author leon(liangzou0318@gmail.com)
 * @date 2013-5-5
 * @filaname BubbleSort.java
 */
public class BubbleSort {
    public static int[] sort(int[] a){
    	/*for(int i=0;i<a.length;i++){
    		for(int j=i+1;j<a.length;j++){
    			if(a[j]<a[i]){
    				int temp=a[i];
    				a[i]=a[j];
    				a[j]=temp;
    			}
    		}
    	}*/
    	/*for(int i=a.length-1;i>=0;i--){
    		for(int j=0;j<i;j++){
    			if(a[j]>a[j+1]){
    				int temp=a[j];
    				a[j]=a[j+1];
    				a[j+1]=temp;
    			}
    		}
    	}*/
    	for(int i=0;i<a.length;i++){
    		for(int j=1;j<a.length;j++){
    			if(a[j]<a[j-1]){
    				int temp=a[j-1];
    				a[j-1]=a[j];
    				a[j]=temp;
    			}
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


