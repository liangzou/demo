package cn.edu.njupt.responbilityOfchain;

import java.util.ArrayList;

public class FilterChain implements Filter{
	
	int index=0;
	ArrayList<Filter> fs=new ArrayList<Filter>();
 public void addFilter(Filter f) {
	   fs.add(f);
}
  
@Override
public void init() {
	// TODO Auto-generated method stub
	
}
@Override
public void dofilter(FilterChain fc) {
	// TODO Auto-generated method stub
	if(index==fs.size()) return;
	
	Filter f1=fs.get(index);
	index++;
	f1.dofilter(fc);
	//System.out.println("end");
}
@Override
public void destory() {
	// TODO Auto-generated method stub
	
}
}
