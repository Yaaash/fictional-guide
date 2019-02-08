import java.util.*;

class BubbleSort{

	public static void main(String[] args){
	
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] a = new int[n];
		for(int i = 0; i < n; i ++){

			a[i] = s.nextInt();
		}
		
		sort(a, n);
	}


	private static void sort(int[]a , int n){

		for(int i = 0; i < n; i ++){

			for(int j = i; j < n; j++){

				if(a[i]>a[j]) {
					int temp = a[j]; a[j] = a[i]; 
					a[i] = temp;
				}
			}
		}

		for(int i = 0; i < n; i ++) System.out.println(a[i]);
	}
}
