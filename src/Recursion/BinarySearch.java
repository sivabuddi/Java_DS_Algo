package Recursion;

import java.util.Scanner;

public class BinarySearch {
	public static int n;
	public static int [] arr = new int[100];
	
	
	public static  void swap(int arr[], int i, int j) {

	final int temp = arr[i]; 
			arr[i] = arr[j];
			arr[j] = temp;
			
	}// swap
	
	

	
	
	public static void display() {
	
	for (int i=n-1;i>0;i--) {
		for (int j=0;j<i;j++) {
			
			if (arr[j] > arr[j+1])
				swap(arr, j,j+1);			
			
		}
		
	}
			
		
		for(int i=0;i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}// display
	
	
	public static void recursivebinary(int key, int lower, int upper) {
		
		int mid = (lower + upper)/2;
		
		
		if (arr[mid] == key) {
			System.out.println(key + " element found at " + (mid+1) + " position");
		
		}
		else if (arr[mid] < key) {
			 lower = mid;
			 recursivebinary(key, lower+1, upper);
			
		}// key element is greater than middle element
		else if (arr[mid] > key){
			  upper = mid;
			  recursivebinary(key, lower, upper-1);
		}
		else {
			 System.out.println(key + " element not found");
		}
	}
	
	
	
	
	public static void main(String[] args) {	
		
		System.out.println("Enter the no.of.elements");
		n = new Scanner(System.in).nextInt();
		System.out.println("Enter "+ n + "elements");
		for(int i=0;i<n;i++) {
			arr[i]=new Scanner(System.in).nextInt();
		}
		
		display();
		System.out.println();
		System.out.println("Enter the element you want to search");
		int key = new Scanner(System.in).nextInt();
		recursivebinary(key, 0, n-1);
		
	}// main
	
	
}//BinarySearch
