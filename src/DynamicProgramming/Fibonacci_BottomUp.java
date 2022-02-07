package DynamicProgramming;

import java.util.Scanner;


public class Fibonacci_BottomUp {
    
	
	

	
	public static int fibonacci(int n) {
		int fib [] = new int [n];
		int i;
		if (n==0 | n ==1)
			return 1;
		
			
		fib[0]=1;
		fib[1]=1;
		for(i=2;i<n;i++)
			fib[i] = fib[i-1]+fib[i-2];
			
		
	
	return fib[n-1]; 
}


	
	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		int n = new Scanner(System.in).nextInt();
		int result = fibonacci(n);
		System.out.println("Result = "+result);
	}

}
