package DynamicProgramming;

import java.util.Scanner;

public class SubsetSumDP {
	
	
	public static boolean subsetsum(int a[], int sum) {
	
	int n = a.length;	
		
	boolean status[][] = new boolean[n+1][sum+1];
	
	
	for(int i=0;i<=n;i++)
		status[i][0]=true;
	
	
	for(int i=1;i<=n;i++) {
		
		
		for(int j=1;j<=sum;j++) {
			
			
			if(a[i-1]>j)
				status[i][j] =status[i-1][j]; 
			else {
				status[i][j] = status[i-1][j] || status[i-1] [j-a[i-1]];
			}
			
		}
		
		
	}
 
	return status[n][sum];
		
	}
	
	
	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 2};
		System.out.println("Enter the expected sum");
		int sum = new Scanner(System.in).nextInt();
		System.out.println("Status : " + subsetsum(arr, sum));
		
		
	}
	

}
