package datastructures;

import javax.xml.stream.events.EndDocument;

public class MergeSortTD2 {
	
	
	public void merge(int a[],int left, int mid, int right) {
		
		

		int [] temp= new int[right-left+1];
		int i=left, j=mid+1, k=0;
		
		// copy the elements in to temporary arrays ( not in memory since we have been using temporary memory)
		
		while(i<=mid && j<=right) {
			
			if(a[i]<=a[j]) 
				temp[k++]=a[i++];
			else 
				temp[k++]= a[j++];
						
		}
			
		
		//left over elements on left sub array 
		while(i<=mid){
			temp[k++]=a[i++];	
		}
		
		// left over elements on right sub array
		while(j<=right) {
			temp[k++]=a[j++];
		}
		
		for(i=left;i<=right;i++)
			a[i] = temp[i-left];
				
		
	}// merge
	
	
	
	public void display(int a[]) {
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		
	}
	
	
	public void sort(int a[],int left, int right) {
		int mid;
		if(left<right) {
			mid = (left+right)/2;
			sort(a,left,mid);
			sort(a,mid+1,right);
			merge(a,left,mid,right);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int ar[]= {88,66,55,44,33,11,22,99};
		MergeSortTD2 ms = new MergeSortTD2();
		System.out.println("Before merge sort");
				  ms.display(ar);
				  ms.sort(ar, 0, ar.length-1);
		System.out.println("After merge sort");
				  ms.display(ar);	
		
		
		
	}
	
	

}
