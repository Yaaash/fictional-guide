import java.util.*;

class RotateArray{

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		/*
		* Length of array
		*/
		int n = s.nextInt();

		/*
		* Rotate by k units
		*/
		int k = s.nextInt();

		int[] a = new int[n];

		for(int i = 0; i < n; i ++) 
			a[i] = s.nextInt();

		rotateArray(a, n, k);

		for(int i =0; i <n; i ++) System.out.println(a[i]);
	}

	private static void rotateArray(int[] arr, int n, int d){
	 	int i, j, k, temp; 
		for (i = 0; i < gcd(d, n); i++) { 
		    /* move i-th values of blocks */
		    temp = arr[i]; 
		    j = i; 
		    while (true) { 
		        k = j + d; 
		        if (k >= n) 
		            k = k - n; 
		        if (k == i) 
		            break; 
		        arr[j] = arr[k]; 
		        j = k; 
		    } 
		    arr[j] = temp; 
		} 
	}

	  /*Fuction to get gcd of a and b*/
	static int gcd(int a, int b) { 
		if (b == 0) 
		    return a; 
		else
		    return gcd(b, a % b); 
	    } 

}



