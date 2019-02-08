import java.util.*;

class ExponentialSearch{

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		
		int[] a = new int[n];
		for(int i = 0; i <n ; i ++){
			a[i] = s.nextInt();
		}

		int elementToSearch = 5;

		for(int i = 1; i <= n; i = i * 2){
			if(a[i] == elementToSearch){
				 System.out.println(i);
				return;
			}
	
			if(a[i]>elementToSearch) {
				doBinarySearch(i, a, elementToSearch);
				return;
			} 
		}

	}
	
	private static void doBinarySearch(int i , int[]a, Integer s){
		Integer[] newa= new Integer[i-i/2+1]; 
		for(int k = i/2; k<i; k++) newa[k] = a[k];
		// do binary search in this section
//		BinarySearch b = new BinarySearch(newa);
//		System.out.println(b.search(s));
	}
}
