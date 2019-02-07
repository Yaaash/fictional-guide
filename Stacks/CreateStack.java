import java.util.*;
import java.lang.*;

class CreateStack {
	
	public static void main (String[] args){
		
		Scanner s = new Scanner(System.in);
		
		Stack myStack = new Stack();
		for(int i = 0; i < 10; i ++)
			myStack.push(s.nextInt());		
		
		
		while(!myStack.isEmpty()){
			System.out.println(myStack.pop());
		}
	}
	
	
	static class Stack{
		
		int headIndex = 0;
		private int[] a ;
		int size = 2;
		
		Stack(){
			a = new int[size];
		}
		
		void push(int val){
			headIndex++;
		
			if(headIndex>=size){
				size = size*2;
				int[] newarray = new int[size];
				for(int i = 0; i <a.length; i ++){
					newarray[i] = a[i];
				}
				a = newarray;
			}
			
				a[headIndex] = val;
				
				System.out.println(headIndex);
		}
		
		int pop() {
			if(headIndex<0){
				System.out.println("nothing to pop : Empty Stack");
				return -1;
			}
			int val = a[headIndex];
			a[headIndex] = 0;
			headIndex--;
			System.out.println(headIndex);
			return val;
		}
		
		int peek() {
			if(headIndex<0){
				System.out.println("nothing to pop : Empty Stack");
				return -1;
			}
			return a[headIndex];
		}
		
		boolean isEmpty(){
			if(headIndex< 0 ){
				return false;
			}else 
				return true;
		}
	}
}