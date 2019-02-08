import java.util.*;

/**
* The Interpolation Search is an improvement over Binary Search for instances, where the values in a sorted array are uniformly distributed. * * * Binary Search always goes to the middle element to check. On the other hand, interpolation search may go to different locations according to * * the value of the key being searched. For example, if the value of the key is closer to the last element, interpolation search is likely to * * * start search toward the end side.
*/
class InterpolationSearch{
	
	int[] mElements;
	
	InterpolationSearch(int[] elements){
		mElements = elements;
	}

	int search(int a){

		int end = mElements.length-1;
		int start = 0;
		int pos = start + ((end-start) / 
                  (mElements[end]-mElements[start]))*(a - mElements[start]); 
		
		return interpolationSearch(a, pos, 0, end);
	}

	int interpolationSearch(int a, int pos, int start, int end){
		if(mElements[pos] == a){
			return pos;
		}

		if(start > end){
			return -1;
		}	

		int newPos = start + ((end-start) / 
                  (mElements[end]-mElements[start]))*(a - mElements[start]); 
		if(mElements[pos] > a){
			// search right part
			return interpolationSearch(a, newPos, pos+1, end);
		} else{
			// search left part
			return interpolationSearch(a, newPos, start, pos-1);
		}
	}
}

