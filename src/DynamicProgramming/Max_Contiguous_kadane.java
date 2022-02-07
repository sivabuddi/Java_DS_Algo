package DynamicProgramming;
// problem with Kadanes algorithm is all input values negative, this algorithm should not prevail.

public class Max_Contiguous_kadane {
	
	public static  int max_cont_n2(int a[], int n) {
		
		int max_sum=0, current_sum=0;
		
		for(int i=0;i<n;i++) {
			
			current_sum = current_sum+a[i];
			
			if(current_sum > max_sum)
				max_sum = current_sum;
			
			if(current_sum<0)
				current_sum =0;
				
			
		}
		
		return max_sum;
		
	}// max_cont_n3

	public static void main(String[] args) {
		
		int a[]= {-2,-1,-4,-5,2};
		
		int result = max_cont_n2(a,a.length);
		
		System.out.println("maximum contigous values= "+ result);
		
	}// main
	
	
}//Max_Contiguous_n3
