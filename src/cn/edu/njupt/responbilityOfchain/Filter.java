package cn.edu.njupt.responbilityOfchain;

public interface Filter {
   public void init();
   public void dofilter(FilterChain fc);
   public void destory();
}
