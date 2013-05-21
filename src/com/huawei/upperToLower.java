package com.huawei;
  
/**
× @author leon(liangzou0318@gmail.com)
* @date 2013-4-25
* 将大写字母转换成其对应小写字母后的第五个字母，大于z的从头开始
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
