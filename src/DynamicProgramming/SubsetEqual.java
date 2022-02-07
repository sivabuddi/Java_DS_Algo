package DynamicProgramming;

public class SubsetEqual {
	
	
public static boolean subsetsum(int a[], int n, int sum) {
		
		
		if (n==0 && sum !=0)
			return false;
		
		if (sum==0)
			return true;
		
		if(a[n-1]>sum)
			return subsetsum(a, n-1, sum);	
		
		else 
			
			return subsetsum(a, n-1, sum) || subsetsum(a, n-1, sum-a[n-1]);
		
		
		
	}//subsetsum


	public  static boolean partitioning(int arr[],int n) {
		
		int sum =0;
		for (int i=0;i<arr.length;i++)
			sum  = sum+arr[i];
		
		
		if (sum%2!=0)
			return false;
		
		return subsetsum(arr, n, sum/2);
		
		
		
	}



	public static void main(String[] args) {
		
		
		int arr[] = {1,3,5,7},sum =0;
		boolean flag = partitioning(arr, arr.length);
		
		if(flag)
			System.out.println("subsets are availabe with equal sum");
		else
			System.out.println("subserts are not available with equal sum");
		

		
	}// main

	

}//SubsetEqual
