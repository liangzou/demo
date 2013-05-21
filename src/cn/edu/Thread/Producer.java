package cn.edu.Thread;

import java.util.concurrent.BlockingQueue;

/**
 * @author leon(liangzou0318@gmail.com)
 * @date 2013-5-4
 * @filaname Producer.java
 */
public class Producer implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	BlockingQueue st;
	public Producer(BlockingQueue st){
		this.st=st;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){			
			try {
				st.put("1");
				System.err.println("Producer.put");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/*	Shortage st;
	public Producer(Shortage st){
		this.st=st;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(st){
			while(st.al.size()>=5){
				System.out.println("Producer Contition");
				try {
					System.out.println("producer.wait");
					st.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("producer.add");
			st.al.add("1");
			st.notifyAll();
		}
	}
   */
}
