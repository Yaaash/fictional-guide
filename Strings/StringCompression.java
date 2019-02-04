import java.util.*;

/**
* Implement a method to perform basic string compression using the counts of repeated characters. 
* For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would 
* not become smaller than the original string, your method should return the original string. You can assume 
* the string has only uppercase and lowercase letters (a - z).
*/
class StringCompression{
	
	public static void main (String[] args){
		Scanner scanner = new Scanner (System.in);
		
		String input = scanner.nextLine();
		
		int count = 0;
		char prev = '\0';
		StringBuilder compressedString = new StringBuilder();
		for(int i = 0; i< input.length(); i ++){
			if(prev != '\0' && prev == input.charAt(i)){
				count ++;
			}else{
				if(prev!= '\0' && count>0)
				compressedString.append(count);
				prev = input.charAt(i);
				count = 0;
				count ++;
				compressedString.append(prev);
			}
		}
		
		if(count>0)
			compressedString.append(count);
		
		String output = compressedString.toString();
		if(input.length() <= output.length()){
			System.out.println(input);
		}else{
			System.out.println(output);
		}
	}
}