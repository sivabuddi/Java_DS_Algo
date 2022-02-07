package DynamicProgramming;

public class Max_Contiguous_n2 {
	
	public static  int max_cont_n2(int a[], int n) {
		
		int max_sum =0;
		for(int i=0;i<n;i++) {

			int current_sum=0; // for every subsequnce make it zero. Best value we are storing in max_sum
			
			for(int j=i;j<n;j++) {
				
					current_sum = current_sum+a[j];
					
					if(current_sum > max_sum)
						max_sum = current_sum;		
				
			}// inner 	
			
			
		}// outer for 
		
		return max_sum;
		
	}// max_cont_n3

	public static void main(String[] args) {
		
		int a[]= {-2,11,-4,13,-5,2};
		
		int result = max_cont_n2(a,a.length);
		
		System.out.println("maximum contigous values= "+ result);
		
	}// main
	
	
}//Max_Contiguous_n3
