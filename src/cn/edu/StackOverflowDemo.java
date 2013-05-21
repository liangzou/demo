package cn.edu;

public class StackOverflowDemo {

	/**
	 * @param args
	 */
	static int i=0;
	public static void a(){
		
			//System.out.println("v");
			a();
		//	System.out.println("a");
		//
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			a();
		
	}

}
