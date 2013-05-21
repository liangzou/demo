package cn.edu;

public class testSyn {

	/**
	 * @param args
	 */

	public synchronized void print() throws InterruptedException{
		Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName()+"  print");
		//Thread.sleep(2000);
	} 
	public synchronized void write(){
		/*try {
			//Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println(Thread.currentThread().getName()+"  witers");
	} 
    public class innerclass extends Thread{
    	private testSyn ts;
    	private String name;
	
		public innerclass(String name,testSyn ts){
    		this.name=name;
    		this.ts=ts;
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*static testSyn ts;*/
		final testSyn ts=new testSyn();
      ts.new innerclass("a1",ts){
    	  
    	  public void run(){
    		  try {
				ts.print();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		  
    	  }
      }.start();
      
      ts.new innerclass("a21",ts){
    	  
    	  public void run(){
    		  ts.write();
    		  
    	  }
      }.start();
	}

}
