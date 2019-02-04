import java.util.*;

/**
*Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word 
* or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. T
* The palindrome does not need to be limited to just dictionary words.
*/
class PalindromePermutation{
	
	public static void main (String[] args){
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		input = input.toLowerCase();
		
		char[] a = new char[256];
		
		for(int i = 0; i < input.length(); i ++){
			char index = input.charAt(i);
			if(index != ' ')
				if(a[index] >0)
					a[index] --;
				else
					a[index] ++;
		}
		
		int count = 0;
		for(int i = 0; i < 256; i ++){
			if(a[i] != 0)
				count++;
		}
		if(count>1){
			System.out.println("False");
			return;
		}
		
		System.out.println("True");
	}
}
				
		