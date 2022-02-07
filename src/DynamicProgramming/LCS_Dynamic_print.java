package DynamicProgramming;



public class LCS_Dynamic_print {
	
	public static int max(int a, int b) {
    	return a>b?a:b;
    }
	
	
	public static void lcs_dynamic(char x[], int m, char y[], int n) {
		
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
		
		int index = arr[m][n]; // store length of longest common subsequence
		int temp = index;
		
		char []lcs = new char[index+1];
		lcs[index] ='\u0000';
		
		int i=m,j=n;
		
		while(i>0 && j>0) {
			
			if(x[i-1] ==  y[j-1]) {
					lcs[index-1] = x[i-1];
				
				i--;
				j--; 
				index--;		
			}
			
			else if(arr[i-1][j] > arr[i][j-1])
				i--;
			
			else 
				j--;
			
				
		
		}// while
		
		
		for(i=0;i<=temp;i++)
			System.out.print(lcs[i]);
			
		
	}//lcs_dynamic
	
	
	public static void main(String[] args) {
		
		String s1="AGGTAB"; // ABCDEFG
		String s2="GXTXAYB";// ADBCEGF
		
		char x[] = s1.toCharArray();
		char y[] = s2.toCharArray();
		
		lcs_dynamic(x,x.length, y, y.length);
		
				
		
		
	}
	
	

}
