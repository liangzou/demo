package com.huawei;

import java.math.BigInteger;

/**
× @author leon(liangzou0318@gmail.com)
* @date 2013-4-25
* 大数相乘
* 大数相加
*/
public class BigNumMutiply {
   
	  public static String toMultiply(String num1,String num2){
		  int len=num1.length()+num2.length();
		  int[] a=new int[len];
		  String sum=null;
		  for(int i=num1.length()-1;i>=0;i--){
			  int a1=num1.charAt(i)-'0';  
			  for(int j=num2.length()-1;j>=0;j--){
				int b1=num2.charAt(j)-'0';
				int m=i+j;				
				a[m]+=a1*b1;
			  }
		  }
		  for(int k=0;k<len;k++){
			  if(a[k]>9){
				  a[k+1]+=a[k]/10;
				  a[k]=a[k]%10;				  
			  }
			  if(k==0)  sum=((Integer)a[k]).toString();			  
			  else sum=a[k]+sum;			
		  }
		  
		  return sum;
	  }
	  //大树相加
	  public static String toadd(String a,String b){
		  int len1=a.length()-1;
		  int len2=b.length()-1;
		  int len=len1+1;
		  int[] sum=new int[len+1];
		  String result="";
		  if(len1>len2){		  
			  for(int i=len2;i>=0;i--){
				  sum[len]=sum[len]+a.charAt(len1)-'0'+b.charAt(i)-'0';
				  if(sum[len]>9){
					  sum[len-1]=1;
					  sum[len]=sum[len]%10;					  
				  }
				  result=sum[len]+result;
				  len1--;
				  len--;				  
			  }
			  for(int i=len;i>0;i--){
				  sum[len]+=a.charAt(i)-'0';
				  if(sum[len]>9){
					  sum[len-1]=1;
					  sum[len]=sum[len]%10;
				  }
				  result=sum[len]+result;
				  len--;
			  }	
			  if(sum[0]==1){
				  result=1+result;
			  }
		  }
		  else return toadd(b,a);
		  return result;
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String a="9999999999999999991";
         String b="9999999999999999999999";
         long time=System.currentTimeMillis();
         System.out.println(toMultiply(a,b));
         //System.out.println(System.currentTimeMillis()-time);
         BigInteger b1=new BigInteger(a);
         BigInteger b2=new BigInteger(b);
         System.out.println(b1.multiply(b2));
         System.err.println(toadd(a, b));
         System.err.println(new StringBuilder(a).reverse());
	}
}
