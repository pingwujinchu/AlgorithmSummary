import java.util.Comparator;

public class QuickSort {
      public static <T> void quickSort(T[]arr,Comparator<T> compare){
    	  quickSort(arr,0,arr.length - 1 ,compare);
      }
      
      private static <T> void quickSort(T[]arr,int p , int q,Comparator<T> compare){
    	   int pivote = p;
    	   int i = p;
    	   int j = q;
    	   while(i < j){
    		    while(compare.compare(arr[j], arr[pivote])>0){
    		    	j --;
    		    }
    		    while(i < j && compare.compare(arr[i], arr[pivote])<=0){
    		    	i ++;
    		    }
    		    if(i > j){
    		    	i --;
    		    }
    		    swap(arr,i,j);
    	   }
    	   swap(arr,i,pivote);
    	   if(p < i-1){
    		   quickSort(arr,p,i-1,compare);
    	   }
    	   if(q > i + 1){
    		   quickSort(arr,i + 1,q,compare);
    	   }
      }
      
      public static <T> void swap(T[]arr,int p,int q){
    	  T tem = arr[p];
    	  arr[p] = arr[q];
    	  arr[q] = tem;
      }
      
      
      public static void quickSort(int []arr){
    	  
      }
      private static  void quickSort(int[]arr,int p , int q){
   	   int pivote = p;
   	   int i = p;
   	   int j = q;
   	   while(i < j){
   		    while(arr[j]> arr[pivote]){
   		    	j --;
   		    }
   		    while(i < j && arr[i] <= arr[pivote]){
   		    	i ++;
   		    }
   		    if(i > j){
   		    	i --;
   		    }
   		    swap(arr,i,j);
   	   }
   	   swap(arr,i,pivote);
   	   if(p < i-1){
   		   quickSort(arr,p,i-1);
   	   }
   	   if(q > i + 1){
   		   quickSort(arr,i + 1,q);
   	   }
     }
     
     public static void swap(int[]arr,int p,int q){
   	  int tem = arr[p];
   	  arr[p] = arr[q];
   	  arr[q] = tem;
     }
     
     public static void main(String []args){
    	 Integer[]arr = new Integer[]{2,1,7,6,8,3,2,1};
    	 QuickSort.quickSort(arr, new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}});
    	 for(int i : arr){
    		 System.out.println(i);
    	 }
    	 
    	 
    	 int[]arr2 = new int[]{2,1,7,6,8,3,2,1};
    	 QuickSort.quickSort(arr2, 0, arr2.length - 1);
    	 System.out.println("=====================");
    	 for(int i : arr2){
    		 System.out.println(i);
    	 }
     }
      
}

