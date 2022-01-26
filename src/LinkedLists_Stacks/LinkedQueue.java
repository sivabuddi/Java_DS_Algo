package LinkedLists_Stacks;


class Link1{
	
	public int data;
	public Link1 next;
	
	public Link1(int data) {
		this.data = data;
	}//constructor
	
	public void displayLink() {				
		System.out.print("---"+data);
	}//displayLink
		
}// Link



class LinkedList1{
	public Link1 first,last;
	
	public LinkedList1() {
		first = null;
		last =null;
	}//constructor
	
	public boolean isEmpty() {
		
		return (first ==null);
	}//isEmpty
	
	public void enQueue(int data) {
		Link1 newNode = new Link1(data);
		if(isEmpty()) {
			newNode.next=last;
			first = newNode;
		}else {
			last.next=newNode;
		}
		last = newNode;
		
	}//push
	
	
	public Link1 deQueue() {
		Link1 currentNode = first;
		first = first.next;
		return currentNode;		
	}
	
	
	
	public void displayQueue() {
		Link1 currentNode=first;
		while(currentNode!=null) {
			currentNode.displayLink();
			currentNode = currentNode.next;
		}		
		
	}
	
}//LinkedList


public class LinkedQueue {
	
public static void main(String[] args) {
	LinkedList1 ll = new LinkedList1();
	ll.enQueue(20);
	ll.enQueue(40);
	System.out.print("Queue {front--->rear} :");
	ll.displayQueue();	
	ll.enQueue(60);
	ll.enQueue(80);
	System.out.println();
	System.out.print("Queue {front--->rear} :");
	ll.displayQueue();	
	ll.deQueue();
	System.out.println();
	System.out.print("Queue {front--->rear} :");
	ll.displayQueue();
	ll.deQueue();
	System.out.println();
	System.out.print("Queue {front--->rear} :");
	ll.displayQueue();
	
}	
	

}
