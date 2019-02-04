import java.util.*;

/**
* There are three types of edits that can be performed on strings: insert a character, remove a character, 
* or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.
*/
class OneAway{
	
	public static void main (String[] args){
		
		Scanner scanner = new Scanner (System.in);
		
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		
		System.out.println(isOneEditAway(s1, s2));
	}
	
	private static boolean isOneEditAway(String s1, String s2){
		
		int diff = s1.length()- s2.length();
		if(Math.abs(diff) == 1 || diff == 0){
			return checkIfOneCharacterDiff(s1, s2);
		}
		
		return false;
	}
	
	/**
	* Assumption all charcters are in small case
	* 
	* Add all s1 characters in array and then s2 characters in array. IF any element has value 1 or greater
	* or -1 or lesser that means change is bigger than expected.
	*/
	private static boolean checkIfOneCharacterDiff(String s1, String s2){
		char[] a = new char[256];
		
		for(int i = 0; i < s1.length(); i ++){
			a[s1.charAt(i)]++;
		}
		
		for(int i = 0; i < s2.length(); i ++){
			a[s2.charAt(i)] --;
		}
		
		int changeCount = 0;
		int onechangeCount = 0;
		for(int i = 0; i <256; i ++){
			if(a[i] >0)
				changeCount++;
			else if (a[i]<0)
				changeCount++;
			
			if(a[i] == 1 || a[i] == -1)
				onechangeCount++;
		}
		
		if(changeCount>1 && onechangeCount>1){
			return false;
		}
		
		return true;
	}
}
