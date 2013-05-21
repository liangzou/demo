package com.huawei;

/**
 * @author leon(liangzou0318@gmail.com)
 * @date 2013-5-8
 * @filaname QuanSort.java
 */
public class QuanPaiXu {
	//static int[] m;
	public static boolean repeat(int a[],int l,int r){
		for(int i=l;i<r;i++){
			if(a[l]==a[r]) return false;
		}
		return true;
	}
    public static void quan(int[] m,int start,int end){
    	
    	if(start==end){
    		for(int i=0;i<m.length;i++){
    			System.out.print(m[i]+" ");
    		}
    		System.out.println();
    	}
    	else{
    	for(int i=start;i<=end;i++){ 
    		//System.out.println(repeat(m,start,i));
    		if(repeat(m,start,i)){
    		int temp=m[start];
    		m[start]=m[i];
    		m[i]=temp; 	   		
    	quan(m,start+1,end);    	
    		 temp=m[start];
    		m[start]=m[i];
    		m[i]=temp;   		
    	}
    	}
    	}
    }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,2};
        quan(a,0,2);
	}

}
