package datastructures;

import java.awt.print.Printable;

public class MergeSortTD1 {
	
	public void merge(int a[],int left, int mid, int right) {
		
		
		int n1,n2;
		n1= mid-left+1;//3 mid-left 3
		n2= right-mid;//5  right-mid+1 4
		
		int [] L= new int[n1];
		int [] R= new int[n2];
		
		// copy the elements in to temporary arrays ( not in memory since we have been using temporary memory)
		for(int i=0;i<n1;i++) {
			L[i]= a[left+i];
			
		}
		
		for(int j=0;j<n2;j++) {
			R[j]= a[mid+j+1]; //mid+j
			
		}
		
		int k=left,i=0,j=0;
		
		while(i<n1 && j<n2) {
			if(L[i] <= R[j]) {
				a[k++]=L[i++];
			}else {
				a[k++]=R[j++];
			}
		}
		
		
		//left over elements on left sub array 
		while(i<n1){
			a[k++]=L[i++];	
		}
		
		// left over elements on right sub array
		while(j<n2) {
			a[k++]=R[j++];
		}
				
		display(a);
	}// merge
	
	
	
	public static void display(int a[]) {
		System.out.println();
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		
		
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
		MergeSortTD1 ms = new MergeSortTD1();
		System.out.println("Before merge sort");
				  display(ar);
		System.out.println();		  
				  ms.sort(ar, 0, ar.length-1);
		System.out.println("\nAfter merge sort");
				  display(ar);	
		
		
		
	}
	

}
