package cn.edu.njupt.responbilityOfchain;

public class Fillterimpl1 implements Filter {

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dofilter(FilterChain fc) {
		System.out.println("1_before");
		fc.dofilter(fc);
		System.out.println("1_after");

	}

	@Override
	public void destory() {
		// TODO Auto-generated method stub

	}

}
