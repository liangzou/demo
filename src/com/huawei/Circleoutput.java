package com.huawei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author leon(liangzou0318@gmail.com)
 * @date 2013-4-27
 * @filaname circleoutput.java
 */
public class Circleoutput {
	public String getOutString(int len, String str, int m){
		String[] temp=str.split(",");
		String ret="";
		ArrayList<String> a=new ArrayList<String>();
		int i=0;
		int j=0;
		int len1=0;
		while(i<len){			
			a.add(temp[i]);
			i++;		
		}
		while(j<len){
			len1=(m-1)%a.size();			
			ret=ret+a.get(len1);
			m=Integer.parseInt(a.get(len1))+len1;
			a.remove(len1);
			j++;
		}
		return ret;
	}
	
	public static void compute(String a){
		int i=0;
		String[] temp=a.split(",");
		ArrayList<String> aa=new ArrayList<String>();
		while(i<temp.length){			
			aa.add(temp[i]);
			i++;		
		}
		Iterator iter=aa.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next());
		}
	}
	
	public static void computeMap(String a){
		int i=0;
		String[] temp=a.split(",");
		Map<String,Integer> aa=new HashMap<String,Integer>();
		while(i<temp.length){			
			aa.put(temp[i], i);	
			System.out.println(temp[i]);
			i++;
		}
		//Set<Entry<String, Integer>> es=aa.entrySet();
		Set s=aa.keySet();
		Iterator iter=s.iterator();
		//System.out.println(s.size());
		while(iter.hasNext()){
			System.out.print(iter.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="3,5,7,4,2,2,9,6";
        Circleoutput c=new Circleoutput();
        //System.err.println(c.getOutString(8, a,10));
        c.computeMap(a);
	}

}
