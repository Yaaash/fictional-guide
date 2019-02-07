import java.util.*;

class DivisibleBy{
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int n = Integer.parseInt(s.nextLine());
		System.out.println(isDivisibleBy2(n));
	}
	
	/**
	* First we right shift a number by 1 then we 
	* left shift a number by 1, if the number is equal to the number specified - it is divisible by 2
	*/
	private static boolean isDivisibleBy2(int n){
		
		int a = n;
		if(a == ((n>>1)<<1))
			return true;
		else  return false;
	}
	
	/**
	* First we right shift a number by 2 then we 
	* left shift a number by 2, if the number is equal to the number specified - it is divisible by 4
	*/
	private static boolean isDivisibleBy4(int n){
		
		int a = n;
		if(a == ((n>>2)<<2))
			return true;
		else  return false;
	}
	
	
	/**
	* First we right shift a number by 3 then we 
	* left shift a number by 3, if the number is equal to the number specified - it is divisible by 8
	*/
	private static boolean isDivisibleBy8(int n){
		
		int a = n;
		if(a == ((n>>3)<<3))
			return true;
		else  return false;
	}
}
