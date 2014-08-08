package cn.edu;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.BitSet;

public class BitDemo {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Integer t=2;
		Double t1=new Double(6.06);
		BigDecimal t2;
		BigDecimal bg=new BigDecimal(4.12345);
		BigDecimal bg1=new BigDecimal(0.033);
		//System.out.println(bg.add(bg1).setScale(2, BigDecimal.ROUND_HALF_DOWN));
		//System.out.println(bg.setScale(2,BigDecimal.ROUND_HALF_UP));
		//System.out.println(t2.compareTo(bg));
		System.out.println(bg.scale());
		//ConcurrentHashMap
		//CopyOnWriteArrayList
		
		System.out.println(t1.longValue());
		
	}

}
