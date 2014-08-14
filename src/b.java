
import java.sql.Timestamp;
import java.util.Date;


public class b extends a {
	public void run() {
        System.out.println("11111");
	}
	public static void main(String[] args){
   //  BitSet bs=new BitSet();
     //bs.set(234);
   //  System.out.println(Integer.toBinaryString((int) Math.pow(2, 29)));
		/*Date date=new Date();
		Timestamp t=new Timestamp(date.getTime());*/
		
		
    // int a=-1024;
		b b1=new b();
		a a1=new a();
		//Test
		//a.run();
		a o=a1.getClass().cast(b1);//将a强制转型到b
		System.out.println(o.getClass().getName());
		o.run();
		double a= Math.pow(2, 31);
		System.out.println(a);
		int ts=2147483647;
     //int b=a>>>1;
    // System.out.println(b);
     //System.out.println(t);
     
	}
}
