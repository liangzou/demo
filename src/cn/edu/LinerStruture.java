package cn.edu;

public class LinerStruture {
	LinerStruture next;
	public  int value;
	public LinerStruture(int i){
		this.value=i;
	}
	public boolean hasNext(){
		return next!=null?true:false;
	}
}
