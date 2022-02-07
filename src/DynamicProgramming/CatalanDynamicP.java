package DynamicProgramming;

import java.util.Scanner;

public class CatalanDynamicP {
	
	public static int catalan(int n) {
		
		int catl[] = new int[n+2];
		
		catl[0]=1;
		catl[1]=1;
		
		for (int i = 2; i <=n; i++) {
			
			catl[i]=0;
			
			for (int j=0;j<i;j++) {
				
				catl[i] += catl[j] * catl[i-j-1];
			}
			
			
		}
		
		return catl[n];
		
	}

	public static void main(String[] args) {
		System.out.println("Enter the number of nodes for Binary Search Tree");
		int n = new Scanner(System.in).nextInt();
		int result = catalan(n);
		System.out.println("Total number of Binary Search Trees from  nodes ="+result);
				
		
	}// main

	

}// CatalanDynamicP
