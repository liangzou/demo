package com.huawei;

/**
 * @author leon(liangzou0318@gmail.com)
 * @date 2013-4-26
 * @filaname DelsubString.java
 */
public class DelsubString {
    public static String delsub(String a,String b){
    	int position=-1;
    	StringBuilder sb=new StringBuilder();
    	for(int i=0;i<a.length();i++){
    		for(int j=i;j<a.length()-b.length();j++){
    			for(int k=0;k<b.length();k++){
    				if((a.charAt(j)==b.charAt(k))&&(k==b.length()-1)){
    					position=j-k;
    				}
    			}
    		}
    	}
    	if(position==-1){
    		return a;
    	}
    	else {
    		int m=0;
    		while(m<a.length()&&(m<position|m>=position+b.length())){
    			sb.append(a.charAt(m));
    			m++;
    			if(m==position){
    				
    				m=position+b.length();
    				System.out.println(a.charAt(m));
    			}
    		}
    	}
    	return sb.toString();
    }
    
    public static String delsub_sim(String a,String b){
    	if(a.contains(b)){
    		String c=a.replace(b, "");
    		return c;
    	}
    	return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a="fwefwggrehehe";
       String b="gre";
       System.out.println(delsub(a,b));
       System.out.println(delsub_sim(a,b));
	}

}
