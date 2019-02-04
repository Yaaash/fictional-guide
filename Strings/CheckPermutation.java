import java.util.*;

/**
* Given two strings, write a method to decide if one is a permutation of the
* other.
*/
class CheckPermutation{
	
	public static void main (String [] args){
		
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		
		System.out.println(isPermutation(s1, s2));
		
	}
	
	/**
	* Check for the length of String, if not same then return false, else create an integer array 
	* with 256 character limit, subtract the element for s2 qand add for s1. if the value becomes 0
	* then they are permutation of each other, else they are different
	*/
	private static boolean isPermutation(String s1, String s2){
		
		if(s1.length() != s2.length())
			return false;
		
		int[] testArray = new int[256];
		
		for(int i = 0; i< s1.length(); i ++){
			testArray[s1.charAt(i)]++;
			testArray[s2.charAt(i)]--;
			
			if(testArray[s2.charAt(i)] != 0 || testArray[s1.charAt(i)] != 0)
				return false;
		}
		return true;
	}
	
}
		
		