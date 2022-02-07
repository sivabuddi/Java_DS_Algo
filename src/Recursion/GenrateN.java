package Recursion;



public class GenrateN {
	public static int count;
	
	public GenrateN() {
		count =1;
	}
public static void printArray(int arr[],int n) {
		
		for (int i=0;i<n;i++)
			System.out.print(arr[i]);	
			
		System.out.println();
		
	}//  printArray
	
	public static void k_string(int arr[],int n, int k) {
		
			if(n<1) {
				printArray(arr, k);
				System.out.print(count++ +" :");
				return;
			}
			else {
				for (int i = 0; i < k; i++) {
					arr[n-1]=i;
					k_string(arr, n-1, k);
				}//for
			}
				
		return;	
	}//k_string function
	
	public static void main(String[] args) {
		GenrateN gn = new GenrateN();
		int n =2,k=3;
		int [] arr = {0,0,0};
		k_string(arr,n,k);
		
		
	}// main
	
	

}
