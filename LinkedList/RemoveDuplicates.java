import java.util.*;

/**
* Write code to remove duplicates from an unsorted li nked list.
*/
class RemoveDuplicates{
	
	static Node head = null;
	static Node nextNode = null;
	
	static class Node{
		int val;
		Node next;
		
		Node(int val){
			this.val = val;
			this.next = null;
		}
	}
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int N = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < N; i ++){
			add(scanner.nextInt());
		}
		
		Node node = head;
		Node prev = null;
		HashSet<Integer> set = new HashSet<>();
		while(node!= null){
			
			boolean isadded = set.add(node.val);
			
			if(!isadded){
				
				// if not added
				Node temp = node;
				node = node.next;
				prev.next = temp.next;
				temp = null;
			}else{
				prev = node;
				node = node.next;
			}
		}
		
		node = head;
		while(node!= null){
			System.out.println(node.val);
			node = node.next;
		}
	}
	
	/**
	* Add to LinkedList
	*/
	private static void add(int value){
		
		if(head == null){
			head = new Node(value);
			nextNode = head;
		}
		
		nextNode.next = new Node(value);
		nextNode = nextNode.next;
	}
}
		