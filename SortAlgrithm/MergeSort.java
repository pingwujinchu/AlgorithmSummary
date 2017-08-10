import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class MergeSort {
	
	 public static <T> void mergeSort(T[]arr,Comparator<T> compare,T maxValue){
		 recursiveMergeSort(arr,0,arr.length-1,compare,maxValue);
	 }
	 
	 public static <T> void recursiveMergeSort(T[]arr,int p,int q,Comparator<T> compare,T maxValue){
		   if(p < q){
			   int m = (p+q)>>1;
		       recursiveMergeSort(arr,p,m,compare,maxValue);
		       recursiveMergeSort(arr,m + 1,q,compare,maxValue);
		       merge(arr,p,m,q,compare,maxValue);
		   }
	 }
	 
	 public static <T> void merge(T[]arr,int p , int m, int q,Comparator<T> compare,T maxValue){
		  T[] l = (T[]) Array.newInstance(maxValue.getClass(),m - p + 2);
		  T[] r = (T[]) Array.newInstance(maxValue.getClass(), q - m + 1);
		  for(int i = 0 ; i < m - p + 1 ; i ++){
			  l[i] = arr[p + i];
		  }
		  l[m-p+1] = maxValue;
		  for(int j = 0 ; j < q - m ; j++){
			  r[j] = arr[m + 1 + j];
		  }
		  r[q-m] = maxValue;
		  int i =0, j =0;
		  for(int k = p ; k <= q ; k ++){
			  if(compare.compare(l[i] , r[j])<0){
				  arr[k] = l[i];
				  i ++;
			  }else{
				  arr[k] = r[j];
				  j++;
			  }
		  }
	 }
	 
	 public static void main(String []args){
		 Integer[]arr = new Integer[]{2,3,1,5,4,8,4,6};
		 MergeSort.mergeSort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		}, Integer.MAX_VALUE);
		 for(int i : arr){
			 System.out.println(i);
		 }
	 }

}
