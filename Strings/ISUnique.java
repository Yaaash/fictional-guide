import java.util.*;

/**
Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
*/
class ISUnique{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		boolean isUnique = isStringUnique(input);
		
		if(!isUnique){
				System.out.println("Not Unique");
		}else{
			System.out.println("Is Unique");
		}
		
	}
	
	/**
	* Converting a string into a sorted array and then using a variable to see
	* if the previous element matches the current one, if it does then the charcters are
	* repeating, hence not unique
	*/
	private static boolean isStringUnique(String input){
		
		if(input.length() <= 1){
			return true;
		}
		
		char[] inputArray = input.toCharArray();
		Arrays.sort(inputArray);
		
		char prevElement = '\0';
	
		for(char s : inputArray){
			if(prevElement == '\0'){
				prevElement  = s;
			}else if(prevElement == s){
				// if previous ellement is equal to current character then there is a repeat.
				return false;
			}
		}
		
		return true;
	}
	
	/**
	* Saving each string element in hash set, then if it doesn't add it 
	* it's not unique
	*/
	private static boolean usingHashSet(String input){
		if(input.length()<= 1)
			return true;
		
		HashSet<Character> myHashSet = new HashSet<>();
		
		for(int i = 0; i < input.length(); i ++){
			boolean isAdded = myHashSet.add(input.charAt(i));
			
			if(!isAdded)
				return false;
		}
		
		return true;
	}
		
}
		
		