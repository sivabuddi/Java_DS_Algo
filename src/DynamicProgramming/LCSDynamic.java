package DynamicProgramming;

public class LCSDynamic {
	
    public static int max(int a, int b) {
    	return a>b?a:b;
    }
	
	
	public static int lcs_dynamic(char x[], int m, char y[], int n) {
		
		int arr[][] = new int [m+1][n+1];
		
		for(int i=0;i<=m;i++) {
			
			for(int j=0;j<=n;j++) {
				
				if(i==0 || j==0)
					arr[0][0]=0;
				else if(x[i-1]== y[j-1])
					arr[i][j]=1+arr[i-1][j-1];
				else 
					arr[i][j] = max(arr[i-1][j], arr[i][j-1]);

				
			}// inner
			
			
		}//outer
		
		return arr[m][n];
			
	}
	
	public static void main(String[] args) {
	
		String s1="ABCDEFG";
		String s2="ADBCEGF";
		
		char x[] = s1.toCharArray();
		char y[] = s2.toCharArray();
		
		int result = lcs_dynamic(x,x.length, y, y.length);
		System.out.println("Longest common subsequence ="+result);
				
	}

}
