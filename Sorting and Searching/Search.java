import java.util.*;

class Search{
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		String[] a = new String[n];
		for(int i = 0; i <n; i ++){
			a[i] = s.nextLine();
		}
		
		BinarySearch b = new BinarySearch(a);
		
		System.out.println(b.search("abc"));
	}
}