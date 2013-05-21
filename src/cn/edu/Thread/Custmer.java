package cn.edu.Thread;

import java.util.concurrent.BlockingQueue;

/**
 * @author leon(liangzou0318@gmail.com)
 * @date 2013-5-4
 * @filaname Custmer.java
 */
public class Custmer implements Runnable{

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	BlockingQueue st;
	public Custmer(BlockingQueue st){
		this.st=st;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				
				st.take();
				System.err.println("Custmer.take");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
    /*Shortage st;   //自定义的队列
	public Custmer(Shortage st){
		this.st=st;
	}*
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(st){
			while(st.al.isEmpty()){
				System.out.println("Producer Contition");
				try {
					st.wait();
					System.out.println("custmer.wait");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("custmer.remove");
			st.al.remove(0);
			st.notifyAll();
		}
	}
	/
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	

}
