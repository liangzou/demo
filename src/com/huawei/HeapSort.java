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
             int k = i;                               // ���浱ǰ�����жϵĽڵ�           
             while (2 * k + 1 <= lastIndex) {  // ����ǰ�ڵ���ӽڵ����                    
                 int biggerIndex = 2 * k + 1;  // biggerIndex���Ǽ�¼�ϴ�ڵ��ֵ,�ȸ�ֵΪ��ǰ�жϽڵ�����ӽڵ�
                 if (biggerIndex < lastIndex) {                     
                    if (data[biggerIndex] < data[biggerIndex + 1]) {   // �����ӽڵ���ڣ������ʱbiggerIndexӦ�õ��� lastIndex                        
                         biggerIndex++;  // �����ӽڵ�ֵ�����ӽڵ�ֵ����biggerIndex��¼�������ӽڵ��ֵ  
                     }  
                 }  
                 if (data[k] < data[biggerIndex]) {  
                     // ����ǰ�ڵ�ֵ���ӽڵ����ֵС���򽻻�2�ߵ�ֵ��������biggerIndexֵ��ֵ��k  
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
