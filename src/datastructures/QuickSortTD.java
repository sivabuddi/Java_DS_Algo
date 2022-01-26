package datastructures;

public class QuickSortTD {
	
	
	public static int partition(int a[], int low, int high) {
		
		int i = low-1,j,pivot= a[high];
		
		for (j=low;j<high;j++) {
			
			if(a[j]<pivot) {
				
				i++;
				swap(a,i,j);
			}	
		 //display(a);
		}
		
		swap(a,i+1,high);
		return i+1;
}
	
	
	public static void swap(int a[],int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	
	public void quickSort(int a[],int low, int high) {
			
		if(low < high) {
			display(a);
		int pi = partition(a,low,high);
		quickSort(a, low, pi-1);
		System.out.println();
		quickSort(a, pi+1, high);
		
				
		}// if
		
		
		
	}// quickSort
	
	
	
	public static void display(int dis[]) {
		System.out.println();
		for(int i=0;i<dis.length;i++) {
			System.out.print(dis[i] + "\t");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		int arr[]= {77,66,55,44,33,22,11,67,32,88,90};
		
		QuickSortTD qs = new QuickSortTD();
					qs.quickSort(arr,0,arr.length-1);
					display(arr);
	}

}
