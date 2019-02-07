import java.util.*;

class Basic{
	
	public static void main(String[] args){
		
		int shift = 2;
		int a = 1<<shift;
		a = a<<shift;
		a = a>>shift;
		
		a = 10>>shift;
		a = a<<shift;
		System.out.println (a);
		
		a = 1>>shift;
		System.out.println(a);
		
	}
	
	static class MyClass{
		
		MyClass(){
		}
	}
}