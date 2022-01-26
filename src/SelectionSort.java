public class SelectionSort {
	private int max_elements;
	private int[] a;
	private int swaps, comparisons;
	
	public  SelectionSort() {
		System.out.println("Enter the no.of.elements you want to enter in to selection sort?");
		max_elements= new java.util.Scanner(System.in).nextInt();
		a=new int[max_elements];
		swaps=0;
		comparisons=0;
	}
	
	public void display() {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
	
	public void insert() {
		System.out.println("Enter "+a.length+" no.of.elements in the Selection sort");
		for (int i = 0; i < a.length; i++) {
			a[i]=new java.util.Scanner(System.in).nextInt();
			
		}
	}
	public void sorting() {
		int max_element=-999999,k=0,temp=0;
		for (int i = a.length; i >0; i--) {
			for (int j = 0; j < i; j++) {
				if(a[j]>max_element) {
					max_element=a[j];
					k =j;
				}	
		    
			 for (int j2 = 0; j2 < a.length; j2++) {
				System.out.print(a[j2]+"\t");
			
			}	
			 System.out.println();	
			}	
			temp = a[k];
			a[k] = a[i-1];
			a[i-1] = temp;
			max_element = -99999;
			System.out.println("---------------------------");
		}
		
	}
	
	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		sort.insert();
		sort.display();
		sort.sorting();
		sort.display();
	}
	
}
