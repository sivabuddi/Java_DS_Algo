//Naive approach
package DynamicProgramming;

public class LCS {
	
	public static int max(int a, int b) {
		
		return a>b?a:b;
		
	}
	
	
	public static int lcs(char x[], int m, char y[], int n) {
		
		if (m ==0 ||n==0)
			return 0;
		
		else if (x[m-1] == y[n-1])
			return 1+ lcs(x, m-1, y, n-1);
		else 
			return max(lcs(x, m, y, n-1), lcs(x, m-1, y, n));
		
	}
	
	
	public static void main(String[] args) {
		String s1="ABDCGFE";
		String s2="ABCDEFG";
		
		char x[] = s1.toCharArray();
		char y[] = s2.toCharArray();
		
		int result = lcs(x,x.length,y,y.length);
		System.out.println("Length of longest common subsequence = "+result);
		
	}
	

}// LCS
