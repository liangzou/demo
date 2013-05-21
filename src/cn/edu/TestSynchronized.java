package cn.edu;

public class TestSynchronized extends Thread {

	private static Runnable name;
	/**
	 * @param args
	 * @return 
	 */
	public TestSynchronized(String name){
		super(name);
	}
	private class innerclass{
		public synchronized void print(){
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Have been intertupted!");
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
			//Thread.currentThread().interrupted();
			System.out.println(Thread.currentThread().getName()+"  print"+Thread.currentThread().isInterrupted());
			
		} 
		public synchronized void wirte(){
			System.out.println(Thread.currentThread().getName()+"  witer");
		} 
	}
	
	public void run(){
		innerclass in=new innerclass();
		in.print();
		//in.wirte();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Thread t1= new TestSynchronized("a1");
       t1.start();
       try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       t1.interrupt();
       //Thread.interrupted();
       try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       System.out.println(t1.isInterrupted());
       /* Thread t2=new TestSynchronized("a2");
        t2.start();
        t2.isInterrupted();*/
	}

}
