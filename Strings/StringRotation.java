import java.util.*;

/**
* Assume you have a method isSubst ring which checks if one word is a substring of another. Given two 
* strings, 51 and 52, write code to check if 52 is a rotation of 51 using only one call to isSubstring (e.g., 
* "waterbottle" is a rotation of "erbottlewat").
*/
class StringRotation{
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String rotatedInput = scanner.nextLine();
		
		isRotated(input, rotatedInput);
	}
	
	private static boolean isRotated(String s1, String s2){
		
		if(s1.length() != s2.length())
			return false;
		
		int s1Pointer = s2.length()-1;
		for(int i = s2.length()-1; i >= 0; i--){
			if(s1.charAt(i) == s2.charAt(i)){
				s1Pointer--;
			}else{
				if(i != 0)
				s1Pointer = s2.length()-1;
			}
		}
		
		System.out.println(s1Pointer);
		
		if(s1Pointer == s2.length()-1){
			return false;
		}
		
		return true;
	}
}