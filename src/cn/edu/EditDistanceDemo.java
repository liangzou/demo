package cn.edu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EditDistanceDemo {

	/**
	 * @param args
	 */
	static int min(int m,int n,int k){	
		return m>n?(n>k?k:n):(m>k?k:m);	
	}
	static int max(int m,int n){
		return (float)m>n?m:n;
	}
	static float z=1;
	static float t=3;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringBuilder a = new StringBuilder();
		StringBuilder b=new StringBuilder();
	/*String	a="abcde";
	String b="bcdefh";*/	
		
		String temp;
		BufferedReader fis=new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\修改记录.txt"));
		BufferedReader fis1=new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\修改记录1.txt"));
		while((temp=fis.readLine())!=null){
			a.append(temp);
		}
		while((temp=fis1.readLine())!=null){
			b.append(temp);
		}
		Integer[][] dist=new Integer[a.length()+1][b.length()+1];
		for(int i=0;i<=a.length();i++){			
			for(int j=0;j<=b.length();j++){
				if(i==0&&j==0){
					dist[i][j]=0;
				}
				else if(i==0|j==0){
					dist[i][j]=i>j?i:j;
				}				
				else if(a.charAt(i-1)==b.charAt(j-1)){
					dist[i][j]=0;
					//System.out.print()
				}
				else dist[i][j]=1;
			}
		}
		for(int i=1;i<=a.length();i++){
			for(int j=1;j<=b.length();j++){
				dist[i][j]=min(dist[i-1][j],dist[i-1][j-1],dist[i][j-1])+dist[i][j];
			}
		}
		
		/*for(int i=0;i<=a.length();i++){
			for(int j=0;j<=b.length();j++){
		      System.out.print(dist[i][j]);
			}
			System.out.println();
			
		}*/
		System.out.println("相似度："+(1-(float)dist[a.length()][b.length()]/max(a.length(),b.length())));

		
	}

}
