package DynamicProgramming;

import java.util.Scanner;

public class Fibonacci_TopDown {

	public static int fibonacci(int n) {
		int fib [] = new int [n+1];
		int i;
		if (n==0 | n ==1)
			return 1;
		
	    fib[n] = fibonacci(n-1)+ fibonacci(n-2);
	    return fib[n];

		
}


	
	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		int n = new Scanner(System.in).nextInt();
		int result = fibonacci(n);
		System.out.println("Result = "+result);
	}

}
