package cn.edu.Thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author leon(liangzou0318@gmail.com)
 * @date 2013-5-4
 * @filaname Wait_Notify.java
 */
public class Wait_Notify {
   public static void main(String[] args){
	   BlockingQueue<String> bq=new LinkedBlockingQueue<String>(3);
	   //
	  for(int i=0;i<20;i++){
		   new Thread(new Producer(bq)).start();
	   }
	  for(int i=0;i<20;i++){
	  new Thread(new Custmer(bq)).start();
	  }
	  // Wait_Notify wn=new Wait_Notify()();
	   /*Shortage s=new Shortage();
	   for(int i=0;i<10;i++){
		   new Thread(new Producer(s)).start();
	   }
	   for(int i=0;i<10;i++){
		   new Thread(new Custmer(s)).start();
	   }*/
   }
}
