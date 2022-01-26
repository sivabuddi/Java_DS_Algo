package placement;

public class InsertionSort {
	private int[] a;
	private int max_elements;
	private int swaps;
	private int comparisons;
	
	public InsertionSort() {
		System.out.println("Enter the no.of.elemets you want to sort using Insertion sort?");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		max_elements = sc.nextInt();
		a=new int[max_elements];
		swaps=0;		
		comparisons=0;
	}
	
	public void display() {
		for(int i=0;i<max_elements;i++) {
		   System.out.print(a[i]+"\t");
		}
	}
	
	public void insert() {
		System.out.println("Insert "+a.length+" no.of.elements");	
		 for (int i = 0; i < a.length; i++) {
			 a[i] = new java.util.Scanner(System.in).nextInt();
			 }
	}
	
	public void sorting() {
		
		for(int i=0;i<max_elements-1;i++) {
			for(int j=i;j>=0;j--) {	
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swaps++;
				}				
			 for(int k=0;k<max_elements;k++)
				 System.out.print(a[k]+"\t");
			 System.out.println();	
			 comparisons++;
			}
			
			System.out.println("------------------------------------");
		}
		
	}
	public static void main(String[] args) {
		InsertionSort ins = new InsertionSort();
		System.out.println();		
		ins.insert();
		System.out.println("Original Array of elements");
		ins.display();
		System.out.println();
		System.out.println("While Sorting an Array");
		ins.sorting();
		ins.display();
		System.out.println();
		System.out.println("No.of.swaps="+ins.swaps);
		System.out.println("No.of.comparisons="+ins.comparisons);		
	}
	
}
