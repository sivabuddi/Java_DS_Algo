package DynamicProgramming;

import java.util.Scanner;

public class Factorial {
	
	
	public static int factorial(int n) {
		
		int fact [] = new int[n];
		
		if(n==0 || n==1)
			return 1;
		
		else 
			return fact[n-1] = n * factorial(n-1);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the value of n");
		int n = new Scanner(System.in).nextInt();
		int result = factorial(n);
		System.out.println(n + "factorial = " + result);
		
	}//main
	

}// Factorial
