package com.huawei;

/**
 �� @author leon(liangzou0318@gmail.com)
 * @date 2013-4-25
 * ��һ��ʮ��������byte���ͣ�ת����������������������ǰ��ߵ���������ߵ������Ӧ��ʮ����
 */
public class toBinary {

	public static int toBinary(byte a){
		int[] m={0,0,0,0,0,0,0,0};
		int i=0;
		int sum=0;
		
		while(a/2!=0){
			int t=a%2;				
			m[i++]=t;
			a=(byte) (a/2);	
		}
			if(a==1){
				m[i]=1;				
			}
			else m[i]=0;
		
		/*for(int j=0;j<=i;j++){
			 sum+=Math.pow(2, i-j)*m[j];
		}*/  //������		
		for(int j=i;j>=0;j--){
			int mi=1;
			for(int y=0;y<i-j;y++){
				mi*=2;
			}
			sum+=m[j]*mi;
		}
		return sum;	
	} 
	
	public static void main(String[] args) {
         byte a=11;
         System.out.println(toBinary(a));
	}

}
