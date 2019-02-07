import java.util.*;

public class BinarySearch<T extends Comparable<T>>{
	
	/**
	* Sorted Array
	*/
	T[] mElements;
	
	public BinarySearch(T[] elements){
		mElements = elements;
	}
	
	public int search(T a){
		
		int middle = mElements.length/2;
		return binarySearch(a, 0, mElements.length-1, middle);
	}
	
	private int binarySearch(T a, int start, int end, int middle){
		
		if(a.equals(mElements[middle])){
			return middle +1;
		}
		
		if(start>end){
			return -1;
		}
		
		if(a.compareTo(mElements[middle])>0){
			 return binarySearch(a, middle+1 , end, (middle+1+end)/2);
		}else{
			 return binarySearch(a, start , middle-1, (middle-1+start)/2);
		}
	}
}