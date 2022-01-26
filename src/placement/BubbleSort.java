package placement;
import java.io.InputStream;
import java.util.Scanner;

public class BubbleSort {

private int []a;
private int elements;
private static int swaps;
private static int comparisons;


public BubbleSort(int nelements) {
  a= new int[nelements];
  elements =0;
    swaps =0;
  
}

public void insert() {
	
	Scanner sc= new Scanner(System.in);
 	a[elements]=sc.nextInt();
 	elements++;
	
}
public void display() {
	for (int i=0;i<elements;i++)
		System.out.print(a[i] + "\t");

	
}

public void sorting() {
	
	for (int i=elements-1;i>0;i--) {
		for (int j=0;j<i; j++) {
			if(a[j]>a[j+1]) {
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				swaps++;	
			for(int k=0;k<elements;k++) 	
			   System.out.print(a[k]+"\t");	
			
			}
			comparisons++;
		 System.out.print("\n");
		} 
		System.out.println("-----------------------------------");
	}
	
}

public static void main(String a[]) throws Exception {
	System.out.print("How many no.of.elements that you want to enter in Bubble Sort?");
	Scanner sc= new Scanner(System.in);
	int no_elements = sc.nextInt();
	BubbleSort s = new BubbleSort(no_elements);
	for(int i=0;i<no_elements;i++)
		s.insert();
	System.out.println("----Original Array of elements-----");
	s.display();
	System.out.println();
	System.out.println("-----Sorting of an array element by element-----");
	s.sorting();
	System.out.println("---- After sorting------------------");
	s.display();
	System.out.println("\n----------------------------\n");
	System.out.println("no.of.swaps ="+s.swaps);
	System.out.println("no.of.comparisons="+s.comparisons);
}



}
