package Recursion;

public class Sortedornot {
	
	public int isarraysortedornot(int arr[],int n) {
		if(n==1)
			return 1;
		else
			
		return (arr[n-1]>arr[n-2])?isarraysortedornot(arr, n-1):0;
		
	} // isarraysortedornot
	
	

	public static void main(String[] args) {
		int arr[] = {11,22,33,45,66,77,88};		
		Sortedornot sr = new Sortedornot();
		int flag=sr.isarraysortedornot(arr, 7);
		
		if(flag !=0)
			System.out.println("Elements are sorted order");
		else 
			System.out.println("Elements are not sorted order");
		
		
	}
	

}
