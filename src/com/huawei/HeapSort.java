package com.huawei;

/**
 * @author leon(liangzou0318@gmail.com)
 * @date 2013-5-5
 * @filaname HeapSort.java
 */
public class HeapSort {
    public static int[] sort(int[] a){
    	for(int i=0;i<a.length;i++){
    		createMaxHeap(a,a.length-1-i);
    		swap(a, 0, a.length - 1 - i);
    	}
    	return a;
    }
    
    public static void createMaxHeap(int[] data,int lastIndex){
    	 for (int i = (lastIndex - 1) / 2; i >= 0; i--) {                
             int k = i;                               // 保存当前正在判断的节点           
             while (2 * k + 1 <= lastIndex) {  // 若当前节点的子节点存在                    
                 int biggerIndex = 2 * k + 1;  // biggerIndex总是记录较大节点的值,先赋值为当前判断节点的左子节点
                 if (biggerIndex < lastIndex) {                     
                    if (data[biggerIndex] < data[biggerIndex + 1]) {   // 若右子节点存在，否则此时biggerIndex应该等于 lastIndex                        
                         biggerIndex++;  // 若右子节点值比左子节点值大，则biggerIndex记录的是右子节点的值  
                     }  
                 }  
                 if (data[k] < data[biggerIndex]) {  
                     // 若当前节点值比子节点最大值小，则交换2者得值，交换后将biggerIndex值赋值给k  
                     swap(data, k, biggerIndex);  
                     k = biggerIndex;  
                 } else {  
                     break;  
                 }  
             }  
         }  
    }
    public static void swap(int[] data, int i, int j) {  
        if (i == j) {  
            return;  
        }  
        data[i] = data[i] + data[j];  
        data[j] = data[i] - data[j];  
        data[i] = data[i] - data[j];  
    }  
    
	public static void main(String[] args) {
		int[] a={12,5,7,8,34,9,4,2,65,7,54};
        int[] b=sort(a);       
        for(int i=0;i<b.length;i++){
        	System.out.print(b[i]+" ");
        }
	}

}
