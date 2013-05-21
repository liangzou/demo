package com.example;

public class ThreadLocalSample {

	/**
	 * @param args
	 */
	/*public class node{
		private String id;
		private String name;
		public node(String id,String name){
			this.id=id;
			this.name=name;
		}
	}*/

	//protected static final String ThreadLocalSample = null;

	//protected static final String  = null;
	
	private static ThreadLocal<node> tl=new ThreadLocal<node>(){
		protected node initialValue() {
			node t=new node("1","id1");
			return t;
			
		}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Thread t1=new Thread(){
    	   public void run(){
    		   System.out.println(tl.get().getId());
    		   tl.set(new node("2","id2"));
    		   System.out.println(tl.get().getId());
    	   }
       };
       
       Thread t2=new Thread(){
    	   public void run(){
    		   System.out.println(tl.get().getId());
    	   }
       };
       t1.start();
       t2.start();
      
     
        //System.out.println(t1.get();
       
	}

}
