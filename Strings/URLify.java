import java.util.*;

class URLify{
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner (System.in);
		
		String input = scanner.nextLine();
		int N = input.length();
		
		char[] inputArray = input.toCharArray();
		
		int spacePointer = N-1;
		for(int i = N-1; i >=0 ; i--){
			if(spacePointer == -1){
				break;
			}
			if(inputArray[i] != ' ' ){
				//  if not space then swap the value with the current space
				inputArray[spacePointer] = inputArray[i];
				spacePointer--;
			}else{
				// if encounter space
				if(spacePointer != N-1){
					// if not the last spaces
					inputArray[spacePointer] = '0';
					spacePointer--;
					inputArray[spacePointer] = '2';
					spacePointer--;
					inputArray[spacePointer] ='%';
					spacePointer--;
				}
			}
		}
		
		String output = new String(inputArray);
		System.out.println(output);
	}
}