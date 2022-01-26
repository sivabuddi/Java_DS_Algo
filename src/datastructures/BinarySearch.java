package datastructures;
import java.util.Scanner;

public class BinarySearch {
	
	private int [] arr;
	private int max_size;
	
	public BinarySearch(int n) {
			max_size=n;
			arr = new int[max_size];
	}
	
	
	public void binarySearch(int n) {
		int found =0;
		int low=0, high=max_size-1,mid;
		for (int i=0;i<max_size;i++) {
			mid =(low+high)/2;
			if(n==arr[mid]) {
				System.out.println(n + " element found at "+ (mid+1)+ " location");
				found = 1;
				break;
			}
			else if(n<arr[i]) {
				high = mid;
			}
			else {
				low = mid;
			}
				
		}
		
		if (found ==0) {
			 System.out.println(n +" element not found in a list");
		}
	} // 
	
	
	public void display() {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter the no.of.elements in a list");
		int n = new Scanner(System.in).nextInt();
		BinarySearch bs = new BinarySearch(n);
		System.out.println("Enter "+n+" elements");
		
		for (int i = 0; i < n; i++) {
			bs.arr[i]= new Scanner(System.in).nextInt(); 	
		}
		
		 bs.display();
		System.out.println(); 
		System.out.println("Enter the element you want to search in a list");
		n = new Scanner(System.in).nextInt();
		bs.binarySearch(n);
	}//main
	
	

}
