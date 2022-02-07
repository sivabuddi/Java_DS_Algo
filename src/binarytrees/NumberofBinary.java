package binarytrees;

import java.util.Scanner;

class Node{
	int data;
	Node left, right;
	
	
	public Node(int data) {
		this.data = data;
		left = right = null;
		
	}// constructor
	
} // Node class 

public class NumberofBinary {
	
	public static int catalan(int n) {
		
		int arr[]  = new int[n+1];
		
		arr[0]=1;
		arr[1]=1;
		
// valid one 
		
//		for(int i=2;i<=n;i++) {
//			
//			for(int j=1;j<=i;j++) {
//				
//				arr[i] += arr[j-1]*arr[i-j]; 
//			}
//			
//		}
		
		
		
		 for(int i=2;i<=n;i++) {
			
			for(int j=0;j<i;j++) {
				
				arr[i] += arr[j]*arr[i-j-1]; 
			}
			
		} 
		  
		 
		
		
		return arr[n];
	} // catalan
	
	public static void main(String[] args) {
		
		System.out.println("Enter the no.of.nodes in a binary tree");
		int n = new Scanner(System.in).nextInt();
		n = catalan(n);
		System.out.println("No.of.binary trees= "+n);
		
	}// main
	
} // NumberofBinary
