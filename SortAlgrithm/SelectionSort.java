import java.util.Comparator;

public class SelectionSort {
          public static <T> void selectionSort(T []arr,Comparator<T> compare){
        	  for(int i = 0 ; i < arr.length ; i ++){
        		   int min = i;
        		   for(int j = i+1; j < arr.length ; j ++){
        			   if(compare.compare(arr[j], arr[min])<0){
        				   min = j;
        			   }
        		   }
        		   swap(arr,i,min);
        	  }
          }
          
          public static <T> void swap(T[]arr,int i,int j){
        	   T tem = arr[i];
        	   arr[i] = arr[j];
        	   arr[j] = tem;
          }
          
          public static void selectionSort(int []arr){
        	  for(int i = 0 ; i < arr.length ; i ++){
       		   int min = i;
       		   for(int j = i+1; j < arr.length ; j ++){
       			   if(arr[j]<arr[min]){
       				   min = j;
       			   }
       		   }
       		   swap(arr,i,min);
       	  }
          }
          
          public static void swap(int []arr,int i,int j){
        	    int tem = arr[i];
        	    arr[i] = arr[j];
        	    arr[j] = tem;
          }
          
          public static void recursiveSelectionSort(int []arr,int p,int q){
        	    if(p < q){
        	    	int min = findMin(arr,p,q);
        	    	swap(arr,min,p);
        	    	recursiveSelectionSort(arr,p +1 ,q);
        	    }
          }
          
          public static int findMin(int []arr,int p , int q){
        	     int min = p;
        	     for(int i = p +1 ; i <= q ; i ++){
        	    	 if(arr[i] < arr[min]){
        	    		 min = i;
        	    	 }
        	     }
        	     return min;
          }
          
          public static void main(String []args){
        	  Integer [] arr = new Integer[]{2,3,1,4,6,5,3,8};
        	  SelectionSort.selectionSort(arr, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return o1.compareTo(o2);
				}
			});
        	  for(int i : arr){
        		  System.out.println(i);
        	  }
        	  
        	  int []arr2 = new int[]{2,3,1,4,6,5,3,8};
        	  SelectionSort.selectionSort(arr2);
        	  System.out.println("=====================");
        	  for(int i : arr2){
        		    System.out.println(i);
        	  }
        	  int []arr3 = new int[]{2,3,1,4,6,5,3,8};
        	  SelectionSort.recursiveSelectionSort(arr3,0,arr3.length - 1);
        	  System.out.println("=====================");
        	  for(int i : arr3){
        		    System.out.println(i);
        	  }
          }
}

