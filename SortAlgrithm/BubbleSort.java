import java.util.Comparator;

public class BubbleSort {
       public static <T> void bubbleSort(T[]arr,Comparator<T> compare){
    	      for(int i = 0 ; i < arr.length ; i ++){
    	    	  for(int j = arr.length - 1;j > i ; j --){
    	    		  if(compare.compare(arr[j],arr[j -1])<0){
    	    			swap(arr,j,j-1);  
    	    		  }
    	    	  }
    	      }
       }
       
       public static <T> void swap(T[]arr,int i , int j){
    	   T tem = arr[i];
    	   arr[i] = arr[j];
    	   arr[j] = tem;
       }
       
       
       public static void bubbleSort(int []arr){
    	   for(int i = 0 ; i < arr.length ; i ++){
 	    	  for(int j = arr.length - 1;j > i ; j --){
 	    		  if(arr[j]<arr[j -1]){
 	    			swap(arr,j,j-1);  
 	    		  }
 	    	  }
 	      }
       }
       public static void swap(int []arr,int i,int j){
    	   int tem = arr[i];
    	   arr[i] = arr[j];
    	   arr[j] = tem;
       }
       
       
       public static void recursiveBubbleSort(int []arr,int p,int q){
    	   if(p < q){
    		   findMin(arr,p,q);
    		   recursiveBubbleSort(arr,p+1,q);
    	   }
       }
       
       public static void findMin(int []arr,int start,int end){
    	   for(int i = end ; i > start ; i--){
    	    	 if(arr[i] < arr[i-1]){
    	    		 swap(arr,i,i-1);
    	    	 }
    	     }
       }
       public static void main(String[]args){
    	   Integer []arr = new Integer[]{2,4,3,1,5,8,6,4};
    	   BubbleSort.bubbleSort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
    	   for(int i : arr){
    		   System.out.println(i);
    	   }
    	   
    	   int []arr2 = new int[]{2,4,3,1,5,8,6,4};
    	   BubbleSort.bubbleSort(arr2);
    	   System.out.println("=================");
    	   for(int i : arr2){
    		   System.out.println(i);
    	   }
    	   
    	   int []arr3 = new int[]{2,4,3,1,5,8,6,4};
    	   BubbleSort.recursiveBubbleSort(arr3,0,arr3.length - 1);
    	   System.out.println("=================");
    	   for(int i : arr3){
    		   System.out.println(i);
    	   }
       }
}
