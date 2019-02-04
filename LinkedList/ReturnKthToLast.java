import java.util.*;

/**
* Implement an algorithm to find the kth to last element of a singly linked list.
*/
class ReturnKthToLast{
	
	private static Node head;
	private static Node nextNode;
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int k = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < n; i ++){
			add(scanner.nextInt());
		}
		
		int i =0;
		Node node = head;
		while(node!= null){
			i++;
			if(n-i+1  == k){
				System.out.println(node.val);
				return;
			}
			node = node.next;
		}
	}
	
	/**
	* Linked List Node
	*/
	private static class Node{
		int val;
		Node next;
		
		Node(int val){
			this.val = val;
			next = null;
		}
	}
	
	/**
	* Add element in linked list
	*/
	private static void add(int value){
		if(head == null){
			head = new Node(value);
			nextNode = head;
			return;
		}
		
		nextNode.next = new Node(value);
		nextNode = nextNode.next;
	}
}
		