import java.util.Comparator;

public class InsertionSort {
        public static <T> void insertionSort(T[]arr,Comparator<T> compar){
        	  for(int i = 1 ; i < arr.length ; i ++){
        		  int j = i-1;
        		  T key = arr[j+1];
        		  while(j >= 0 && compar.compare(arr[j], key)>0){
        			  swap(arr,j+1,j);
        			  j --;
        		  }
        	  }
        }
        
        public static  void insertionSort(int[]arr){
      	  for(int i = 1 ; i < arr.length ; i ++){
      		  int j = i-1;
      		  int key = arr[j+1];
      		  while(j >= 0 && arr[j] > key){
      			  swap(arr,j+1,j);
      			  j --;
      		  }
      	  }
      }
        
        public static void swap(int []arr,int i , int j){
        	int tem = arr[i];
        	arr[i] = arr[j];
        	arr[j] = tem;
        }
        
        public static <T> void swap(T []arr,int i , int j){
        	T tem = arr[i];
        	arr[i] = arr[j];
        	arr[j] = tem;
        }
        
        public static void recursiveInsertionSort(int []arr,int start ,int end){
        	  if(start < end){
        		  recursiveInsertionSort(arr,start,end - 1);
        		  insert(arr,start,end - 1);
        	  }
        }
        
        public static void insert(int []arr,int p,int q){
        	int key = arr[q + 1];
            int j = q ;
            while(j >= 0 && arr[j] > key){
            	 swap(arr,j+1,j);
            	 j --;
            }
        }
        
        public static void main(String[]args){
        	Integer []arr = new Integer[]{2,1,5,4,3,6,9};
        	InsertionSort.insertionSort(arr, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					if(o1 > o2){
						return 1;
					}else if(o2 > o1){
						return -1;
					}else{
					   return 0;
					}
				}
			});
        	for(int i : arr){
        		System.out.println(i);
        	}
        	
        	int []arr2 = new int[]{9,8,7,5,6,4,3,4,1};
        	InsertionSort.insertionSort(arr2);
        	System.out.println("=====================");
        	for(int i : arr2){
        		System.out.println(i);
        	}
        	
        	int []arr3 = new int[]{9,8,7,5,6,4,3,4,1};
        	InsertionSort.recursiveInsertionSort(arr3,0,arr3.length - 1);
        	System.out.println("=====================");
        	for(int i : arr3){
        		System.out.println(i);
        	}
        	
        }
}

