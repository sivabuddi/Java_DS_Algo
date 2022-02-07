package DynamicProgramming;

import java.util.Scanner;

public class SubsetsumRecusion {
	
	
	public static boolean subsetsum(int a[], int n, int sum) {
		
		
		if (n==0)
			return false;
		
		if (sum==0)
			return true;
		
		if(a[n-1]>sum)
			return subsetsum(a, n-1, sum);	
		
		else 
			
			return subsetsum(a, n-1, sum) || subsetsum(a, n-1, sum-a[n-1]);
		
		
		
	}
	
	
	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 2};
		System.out.println("Enter the expected sum");
		int sum = new Scanner(System.in).nextInt();
		System.out.println("Status : " + subsetsum(arr, arr.length, sum));
		
		
	}

}
