package com.huawei;

/**
 * @author leon(liangzou0318@gmail.com)
 * @date 2013-4-26
 * @filaname MaxHuiWen.java
 */
public class MaxHuiWen {
    public static String huiwen(String a){
    	StringBuilder sb=new StringBuilder(a);
    	int length=0;
    	String huiwens=null;
    	for(int i=0;i<a.length();i++){
    		for(int j=i;j<a.length();j++){
    			for(int k=1;k<a.length()-j+1;k++){
    				String sub=sb.substring(j,j+k);
    				StringBuilder reversesub=(new StringBuilder(sub)).reverse();		  				
    				if(sub.equals(reversesub.toString())){   	
    					System.out.println(sub+" "+k);
    					if(k>length){
    						huiwens=sub;
    						length=k;  						
    					} 
    				}
    				}
    			}
    		}
    	
    	return huiwens;
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a="abbac";
       System.err.println(huiwen(a));
       /*StringBuilder reversesub=(new StringBuilder(a)).reverse();
       System.err.println(reversesub.toString().equals(a));*/
	}

}
