package datastructures;

import java.util.Scanner;

public class LinearSearch {
	
	private int [] arr;
	private int max_size;
	
	public LinearSearch(int n) {
			max_size=n;
			arr = new int[max_size];
	}
	
	
	public void linearSearch(int n) {
		int found =0;
		for (int i=0;i<max_size;i++) {
			
			if(arr[i]==n) {
				System.out.println(n + " element found at "+ (i+1) + " position");
				found =1;
				break;
			}
			
			
		}//for
		
		if (found ==0) {
			System.out.println(n + " element not found in a list");
		}
		
	} // 
	
	
	public void display() {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter the no.of.elements in a list");
		int n = new Scanner(System.in).nextInt();
		LinearSearch ls = new LinearSearch(n);
		System.out.println("Enter "+n+" elements");
		
		for (int i = 0; i < n; i++) {
			ls.arr[i]= new Scanner(System.in).nextInt(); 	
		}
		
		 ls.display();
		System.out.println(); 
		System.out.println("Enter the element you want to search in a list");
		n = new Scanner(System.in).nextInt();
		ls.linearSearch(n);
	}//main
	

}// LinearSearch
