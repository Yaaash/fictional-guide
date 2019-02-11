import java.util.*;
import java.lang.*;

class JumpSearch<T extends Comparable>{

	T[] mElements;
	int jumpIndex;

	JumpSearch(T[] elements){
	 mElements = elements;
	jumpIndex = (int)Math.sqrt((double)elements.length);
	}

	/**
	* Idea is to jump every 4 index then check if the 
	* element is greater or less than the last jump index
	* If yes, then we do a linear search in that segment
	*/
	int search(T a){
	 
		int previousIndex = 0;
		int endIndex = 0;
		for(int i = 0; i < mElements.length; i = i + jumpIndex){

			if(mElements[i].equals(a)){
				return i;
			}else if(mElements[i].compareTo(a)>0){
				// meanin the segment is found
				endIndex = i;
				break;
			}
			previousIndex = i;
		}

		if(endIndex == 0){
			return -1;
		}

		for(int i = previousIndex ; i <endIndex; i ++){
			if(mElements[i].equals(a)){
				return i;
			}
		}

		return -1;
	}
		
}
