package cn.edu.njupt.responbilityOfchain;

public class Filterimpl2 implements Filter {
	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dofilter(FilterChain fc) {
		System.out.println("2_before");
		fc.dofilter(fc);
		System.out.println("2_after");

	}

	@Override
	public void destory() {
		// TODO Auto-generated method stub

	}
}
