import java.util.*;

/**
* Implement an algorithm to delete a node in the middle (i.e., any node but the first and last node, not necessarily the 
* exact middle) of a singly linked list, given only access to that node. EXAMPLE:
* Input: the node c from the linked list a - >b- >c - >d - >e- >f
* Result: nothing is returned, but the new linked list looks like a - >b- >d - >e- >f
*/
class DeleteMiddleElement{
	
	private static Node head;
	private static Node nextNode;
	
	public static void main (String[] args){
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i = 0; i < n ; i ++){
			add(s.nextInt());
		}
		
		Node first = head;
		Node second = head;
		Node prev = null;
		while(second != null){
	
			if(second.next != null)
				second = second.next.next;
			else 
				second = null;
			if(second != null){
				prev = first;
				first = first.next;
			}
		}
		
		prev.next = first.next;
		System.out.println(first.val);
		first = null;
		
	}

	private static class Node{
		
		int val;
		Node next;
		
		Node(int val){
			this.val = val;
			next = null;
		}
	}
	
	private static void add(int val){
		if(head == null){
			head = new Node(val);
			nextNode = head;
			return;
		}
		
		nextNode.next = new Node(val);
		nextNode = nextNode.next;
	}
}

		