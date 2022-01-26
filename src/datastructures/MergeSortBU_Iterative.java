package datastructures;

public class MergeSortBU_Iterative {
	

		
		public void mergeSort(int a[]) {
		
			if(a==null) {
				return;
			}
				
			if(a.length>1) {
		      
			 int mid = a.length/2;			 
			 // split left 
			 int []left = new int[mid];
			 
			 for(int i=0;i<mid;i++)
				 left[i]=a[i];
			 
			 //split right
			 int []right =new int[a.length-mid];
			 
			 for(int j=mid;j<a.length;j++)
				 right[j-mid]=a[j];
			 
			 
			 mergeSort(left);
			 mergeSort(right);
			 
			 int i=0,j=0,k=0;
			 
			 
			 while(i<left.length && j<right.length) {
				 
				 if(left[i]<right[j])
					 a[k++]=left[i++];
				 else 
					 a[k++]=right[j++];
				 
			 }
			 
			 while(i<left.length)
				 a[k++]=left[i++];
			 
			 while(j<right.length)
				 a[k++]=right[j++];
			 
			 
				
			}//if
		
		}//mergeSort
				
				
		
		
		public void display(int a[]) {
			
			for(int i=0;i<a.length;i++)
				System.out.println(a[i]);
						
		}
		
		
		
		public static void main(String[] args) {
			
			int ar[]= {88,66,55,44,33,11,22,99};
			MergeSortBU_Iterative ms = new MergeSortBU_Iterative();
			System.out.println("Before merge sort");
					  ms.display(ar);
					  ms.mergeSort(ar);
			System.out.println("After merge sort");
					  ms.display(ar);	
			
			
			
		}
		

	}

	
	
	


