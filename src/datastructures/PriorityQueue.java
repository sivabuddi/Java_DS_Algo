package datastructures;
import java.util.*;

public class PriorityQueue {
	
	private int [] arr;
	private int max_size;
	private int count;
	
	public PriorityQueue(int n) {
		max_size=n;
		arr = new int[max_size];
		count = 0;
	}
	
	public boolean isEmpty() {
		
		return (count ==0);
	}
	
	public boolean isFull() {
		return (count==max_size-1);
	}
	
	public void insert(int item) {
		int i;
		if(count==0) {
			arr[count++]=item;
		}
		
		else {
		
			for(i=count-1;i>=0;i--) {
			
			if(item >arr[i]) {
				   arr[i+1]=arr[i];
				   }//if
			   else {
				   break;			
			}//else   
			
			 
		  }//for		
			arr[i+1]=item;
			count++;
			
		}//else
			
			
}//insert method
	
	
	
	public int removes() {
		
		return arr[--count];
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter the size of Priority Queue");
		int n = new Scanner(System.in).nextInt();
		PriorityQueue pq = new PriorityQueue(n);
		
		
		pq.insert(10);
		pq.insert(5);
		pq.insert(30);
		pq.insert(-5);
		pq.insert(35);
//		
		int removing_item;
//		removing_item = pq.removes();
//		System.out.println(removing_item);	
		
		while(!pq.isEmpty()) {
		removing_item = pq.removes();
		System.out.println(removing_item);			
		}// while
		
		
	}// main
	
	
	
	

}// PriorityQueue
