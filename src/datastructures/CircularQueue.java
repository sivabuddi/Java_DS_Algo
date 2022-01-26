package datastructures;
import java.util.*;

public class CircularQueue {
	

	private int front,rear,max_size;
	private int [] arr;
	private int index,count;
	
	public CircularQueue(int number) {
		max_size=number;
		front =0;
		rear = max_size-1;
		arr = new int[max_size];
		count =-1;
		index =0;
	}
	
	//Operations on Queues
	
	public void insert(int n) {
		if(++count<=rear)
			arr[front++]=n;
		else
			arr[index++]=n;
				
	}
	
	public int delete() {
		front = (front)%max_size;
		index = front;
		front++;
		return arr[index];
	}
	
	public boolean isFull() {
		return front == rear;
	}
	
	public boolean isEmpty() {
		
		return front==0;
	}
	
	public static int getNumber() {
		return new Scanner(System.in).nextInt();
	}//getString
	

	public static void main(String[] args) {
		System.out.println("How many numbers you want to insert in to the Circular Queue\n");
		int n = getNumber();
		CircularQueue cq = new CircularQueue(n);
		int number,option;
		
		while(true) {
		
		System.out.println("Enter the Menu \n 1.Insert \n 2.Delete \n 3.Display");
		option = new Scanner(System.in).nextInt();
		
		switch(option) {
		case 1:
				System.out.println("Enter the number you want to insert\n");
				number = new Scanner(System.in).nextInt();
				cq.insert(number);
				break;
		
		case 2:
				number = cq.delete();
				System.out.println("Deleted element on the Queue"+number);
				cq.arr[cq.index]=0;
				break;
		
		case 3:
				for(int i=0;i<cq.arr.length;i++) {
				 System.out.println(cq.arr[i]);	
				}
				break;
				
		default:
		
		}// switch
		
	}// while	
	
}//main
	
	

	
}//Class
