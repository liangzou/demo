package com.huawei;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author leon(liangzou0318@gmail.com)
 * @date 2013-4-26
 * @filaname filterchar.java
 */
public class filterchar {
	
	public static String filter(String a){
	    /*Map<Character,Integer> m=new HashMap<Character,Integer>();*/
	    Set<Character> s=new HashSet<Character>();
	    StringBuilder sb=new StringBuilder();
	    for(int i=0;i<a.length();i++){
	    	char c=a.charAt(i);
	    	if(s.isEmpty()|!s.contains(c)){
	    		s.add(c);
	    		sb.append(c);
	    	}
	    }
		return sb.toString();
	}
	
	public static String compress(String a){
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		StringBuilder sb=new StringBuilder();
		StringBuilder sb1=new StringBuilder();
		for(int i=0;i<a.length();i++){
			Character c=a.charAt(i);
			if(m.isEmpty()|!m.containsKey(c)){
				m.put(c, 1);
				sb.append(c);
			}
			else{
				m.put(c, m.get(c)+1);
			}
		}
		for(int i=0;i<sb.length();i++){
			Character c=sb.charAt(i);
			int t=m.get(c);
			sb1.append(t);
			sb1.append(c);
		}
		return sb1.toString();
	}
	
	public static String seq_compress(String a){
		StringBuilder sb=new StringBuilder();
		int count=1;
		for(int i=0;i<a.length();i++){						
			char c=a.charAt(i);			
			if(i!=0&&c==a.charAt(i-1)){
				count++;
			}
			else if(i!=0&&c!=a.charAt(i-1)){
				sb.append(count);
				sb.append(a.charAt(i-1));
				count=1;
			}
			else{
				count=1;
			}
		}
		sb.append(count);
		sb.append(a.charAt(a.length()-1));
		return sb.toString();
	}
	
	public static String compute(String a){
		String[] as=a.split(" ");
		int result=Integer.valueOf(as[0]);
		
		
		for(int i=0;i<as.length;i++){	
			//System.out.println(i);
			
			/*if(as[4].equals("")){
			//	System.out.println("fwfwefwefewf");
			}*/
			//System.out.println(as[i]);
			
				
			  
		   if(as[i].equals("+")){			
				result+=Integer.valueOf(as[i+1]);
			}
			else if(as[i].equals("-")){
				result-=Integer.valueOf(as[i+1]);
			}
			
		}
		return String.valueOf(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ast="";
		Scanner s=new Scanner(System.in);
       // ast=s.next();
		String a=s.next(); 
		//String a="aaaataaa";
         System.out.println(a.concat("123"));
         System.out.println(filter(a));
         System.out.println(compress(a));
         System.out.println(seq_compress(a));
         System.out.println(compute("12 + 13 - 21"));
         
        // System.out.println(ast+ast);
	}

}
