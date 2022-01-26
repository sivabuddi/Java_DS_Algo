package datastructures;

public class QueueApp {
	
	private int [] arr;
	private int max_size;
	private int front,rear;
	
	
	public QueueApp(int n) {
		max_size=n;
		arr = new int[max_size];
		front=-1;
		rear=max_size-1;
	}
	
	
	public void enqueue(int element) {
		arr[++front]=element;
	}
	
	public int deque() {
		int index = (front+1)%max_size;
		front++;
		rear--;
		return arr[index];
	}
	
	public void display() {
		
		for (int i = 0; i < max_size; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public boolean isFull() {
		return front == rear;
	}
	
	public boolean isEmpty() {
		return (rear ==-1);
	}
	
	
	public static void main(String[] args) {
		System.out.print("Enter the no.of.elements that you want to insert into to queue");
		int n = new java.util.Scanner(System.in).nextInt();
		QueueApp queue = new QueueApp(n);
		while (!queue.isFull()) {
			n = new java.util.Scanner(System.in).nextInt();
			queue.enqueue(n);				
		}
		
		queue.display();
		System.out.println("After Dequeue operation \n");
		while(!queue.isEmpty()) {
		n = queue.deque();
		System.out.println(n);
		}
		
			
	}
	
	
}
