package cn.edu;

import java.util.List;

public class LinerStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinerOperation lo=new LinerOperation(new LinerStruture(0));
		
		
			//System.out.println(new LinerStruture(i).value);
		for(int i=1;i<10;i++){
			lo.addNode(new LinerStruture(i));
			//System.out.println("123");
		}
		
		lo.show();
	}

}
