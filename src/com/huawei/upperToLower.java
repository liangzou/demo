package com.huawei;
  
/**
�� @author leon(liangzou0318@gmail.com)
* @date 2013-4-25
* ����д��ĸת�������ӦСд��ĸ��ĵ������ĸ������z�Ĵ�ͷ��ʼ
*/
public class upperToLower {

	
	public static Character tolower(Character c){
		if(c+5<'Z'){
			return (char) (c+32+5);
		}
		else{
			return (char)(c+4-'Z'+'A');
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Character t='Y';
       System.out.println(tolower(t));
	}

}
