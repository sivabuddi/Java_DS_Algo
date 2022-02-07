package DynamicProgramming;

public class Max_Contigous_DP {
	
	
	public static int max_cont_dp(int arr[], int n) {
		
		int [] M= {0,0,0,0,0,0};
		int max_sum =0;
		if(arr[0]>0)
			M[0]=arr[0];
		else 
			M[0]=0;
		
		for(int i=1;i<n;i++) {
			
			if(M[i-1]+arr[i]>0)
				M[i]= M[i-1]+arr[i];
			else 
				M[i]=0;
		}
		
		for(int i=0;i<n;i++) {
			
			if(M[i]>max_sum)
				max_sum =M[i];
		}
		
		return max_sum;
		
	}
	
	
	public static void main(String[] args) {
		
		int a[]= {-2,11,-4,13,-5,-2};
		
		int result = max_cont_dp(a,a.length);
		System.out.println("Max_contiguous_subsequence "+result);
		
		
	}

}
