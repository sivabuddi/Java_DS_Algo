package DynamicProgramming;
import java.util.*;
public class CatalanNumber {
	
	public static int catalan(int n) {
		
		if (n==0)
			return 1;
		
		int count =0;
		
		for(int i=1;i<=n;i++)
			count = count + catalan(n-i)* catalan(i-1);
		
		
		return count;
		
	}

	public static void main(String[] args) {
		System.out.println("Enter the number of nodes for Binary Search Tree");
		int result = catalan(new Scanner(System.in).nextInt());
		System.out.println("Total number of Binary Search Trees from  nodes ="+result);
				
		
	}// main

}// CatalanNumber

