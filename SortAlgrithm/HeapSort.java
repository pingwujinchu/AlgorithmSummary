import java.util.Comparator;

public class HeapSort {
       public static <T> void justifyHeap(T[]arr,int i,int heapSize,Comparator<T> compare){
    	     int largest = i;
    	     if(2*i+1 < heapSize && compare.compare(arr[largest], arr[2*i+1])<0){
    	    	 largest = 2*i+1;
    	     }
    	     if(2*i + 2 < heapSize && compare.compare(arr[largest], arr[2*i + 2])<0){
    	    	 largest = 2*i+2;
    	     }
    	     if(largest != i){
    	    	 swap(arr,i,largest);
    	    	 justifyHeap(arr,largest,heapSize,compare);
    	     }
       }
       
       public static <T> void buildHeap(T[]arr,Comparator<T> compare){
    	   for(int i = arr.length/2 - 1; i >= 0 ; i --){
    		   justifyHeap(arr,i,arr.length,compare);
    	   }
       }
       
       public static <T> void heapSort(T[]arr,Comparator<T> compare){
    	   buildHeap(arr,compare);
    	   int heapSize = arr.length;
    	   while(heapSize>0){
    		   swap(arr,0,heapSize-1);
    		   heapSize--;
    		   justifyHeap(arr,0,heapSize,compare);
    	   }
       }
       
       public static <T> void swap(T[]arr,int i, int j){
    	   T tem = arr[i];
    	   arr[i] =  arr[j];
    	   arr[j] = tem;
       }
       
       public static  void justifyHeap(int[]arr,int i,int heapSize){
  	     int largest = i;
  	     if(2*i+1 < heapSize && arr[largest]<arr[2*i+1]){
  	    	 largest = 2*i+1;
  	     }
  	     if(2*i + 2 < heapSize && arr[largest]<arr[2*i + 2]){
  	    	 largest = 2*i+2;
  	     }
  	     if(largest != i){
  	    	 swap(arr,i,largest);
  	    	 justifyHeap(arr,largest,heapSize);
  	     }
     }
     
     public static  void buildHeap(int[]arr){
  	   for(int i = arr.length/2 - 1; i >= 0 ; i --){
  		   justifyHeap(arr,i,arr.length);
  	   }
     }
     
     public static  void heapSort(int[]arr){
  	   buildHeap(arr);
  	   int heapSize = arr.length;
  	   while(heapSize>0){
  		   swap(arr,0,heapSize-1);
  		   heapSize--;
  		   justifyHeap(arr,0,heapSize);
  	   }
     }
     
     public static void swap(int[]arr,int i, int j){
  	   int tem = arr[i];
  	   arr[i] =  arr[j];
  	   arr[j] = tem;
     }
       
       
       public static void main(String []args){
    	   Integer[]arr = new Integer[]{2,4,1,3,7,5,8,6,0,3};
    	   HeapSort.heapSort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
    	   for(int i : arr){
    		   System.out.println(i);
    	   }
    	   
    	   int []arr2 = new int[]{2,4,1,3,7,5,8,6,0,3};
    	   HeapSort.heapSort(arr2);
    	   System.out.println("====================");
    	   for(int i : arr2){
    		   System.out.println(i);
    	   }
       }
}
