package cn.edu;

public class LinerOperation {
	
	LinerStruture node;
	//LinerStruture pointer;
		
	public LinerOperation(LinerStruture node) {		
		this.node = node;
	}

	public void addNode(LinerStruture ls){
		LinerStruture pointer=node;
		//System.out.println(pointer.hasNext());		
		while(true){
			//System.out.println("fews");
			if(!pointer.hasNext()){
				pointer.next=ls;
				//pointer=ls;
				//System.out.println("few");
				break;
			}
			pointer=pointer.next;
		}						
	}
	
	public void insertNode(LinerStruture p,LinerStruture q){
		LinerStruture temp=p.next;
		p.next=q;
		q.next=temp;
	}
	
	public LinerStruture getNext(){
		LinerStruture p=node.next;
		while(p.hasNext()){
			p=p.next;
		}
		return node.next;
	}
	
	
	public void show(){
		LinerStruture p=node;
		System.out.println(node.value);
		while(p.hasNext()){
			p=p.next;
			System.out.println(p.value);
		}
	}
	
	


}
