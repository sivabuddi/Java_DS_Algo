package Recursion;

public class BinaryString {
	
	public static void printArray(int arr[],int n) {
		
		for (int i=0;i<n;i++)
			System.out.print(arr[i]+"");	
		
		System.out.println();
		
	}//  printArray
	
	public static void binary(int n,int arr[], int i) {
		
		if(i==n) {
			printArray(arr, n);
		return;	
		}	
		
		arr[i]=0;
		binary(n,arr,i+1);
		
		arr[i]=1;
		binary(n,arr,i+1);
		
			
	}//binary function
	
	public static void main(String[] args) {
		int n =3;
		int [] arr = new int[3];
		binary(n,arr,0);
		
		
	}// main

}// BinaryString
