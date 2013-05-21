package cn.edu.njupt.responbilityOfchain.test;

import org.junit.Test;

import cn.edu.njupt.responbilityOfchain.Fillterimpl1;
import cn.edu.njupt.responbilityOfchain.FilterChain;
import cn.edu.njupt.responbilityOfchain.Filterimpl2;
import cn.edu.njupt.responbilityOfchain.Filterimpl3;

public class FilterTest {
 @Test
  public void doFilerTest(){
	 FilterChain fc=new FilterChain();
	 Fillterimpl1 f1=new Fillterimpl1();
	 Filterimpl2 f2=new Filterimpl2();
	 Filterimpl3 f3=new Filterimpl3();
	 //f1.dofilter(f2);
	 fc.addFilter(f1);
	 fc.addFilter(f2);
	 fc.addFilter(f3);
	  
	 fc.dofilter(fc);
	 
 } 
}
