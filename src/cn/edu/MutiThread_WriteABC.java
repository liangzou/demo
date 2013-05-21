package cn.edu;

import java.util.concurrent.locks.ReentrantLock;

public class MutiThread_WriteABC {
	private final String[] names={"A","B","C"};
	private final int size=names.length*10;
	private volatile int curpos;
	private volatile int count;
	ReentrantLock lock=new ReentrantLock();
	
	//private String name;
	/*public MutiThread_WriteABC(String name){
		super();
	}*/
	/*@Override
	public void run() {
		
		
	}*/
	public void print(){
		String name=Thread.currentThread().getName();
		 /*   lock.lock();
		  try{			
			if(names[curpos].equals(name)&&count<size){
				curpos=(curpos+1)%names.length;
				count++;
				System.out.print(name);
			}
		   }finally{
			   lock.unlock();
		   }*/
		synchronized(this){
			if(names[curpos].equals(name)&&count<size){
				curpos=(curpos+1)%names.length;
				count++;
				System.out.print(name);
		}
		} 
	}
	private class Muti_Thread extends Thread {
      
		public Muti_Thread(String name){
			super(name);
		}
		public void run() {
			// TODO Auto-generated method stub
			while(count<size){
	            print();
			}
		}
		
		}

	
	
	public static void main(String[] args){
		MutiThread_WriteABC mtw=new MutiThread_WriteABC();
		mtw.startThread();
	}

	private void startThread() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++){
			new Muti_Thread(names[i]).start();
			
		}
	}
	
       
}



