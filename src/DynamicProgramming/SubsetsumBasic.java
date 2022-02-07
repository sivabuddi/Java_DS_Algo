package DynamicProgramming;

public class SubsetsumBasic {
	
	public static void subsetsum(int arr[], int n) {
		int targetsum = 15, currentsum=0;
		int index[]= new int [n];
		for(int i=0;i<n;i++) {
		
			currentsum=0;
			
			for(int j=i;j<n;j++) {
			
			 currentsum = currentsum +arr[j];
			 
			 if(currentsum == targetsum) {
				 
				 System.out.println("subset found");
				 
			 }
			 
								
			}// inner for
			
		}/// outer for
		
//	return currentsum;	
	
	}//subsetsum

	
	
	public static void main(String[] args) {
		
		int ar[] = {2,3,11,12}; // valid only for contiguous elements
		subsetsum(ar, ar.length);
		//System.out.println("subset sum ="+result);	
		
	} 
	
}
