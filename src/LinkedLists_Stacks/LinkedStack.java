package LinkedLists_Stacks;

class Link{
	
	public int data;
	public Link next;
	
	public Link(int data) {
		this.data = data;
	}//constructor
	
	public void displayLink() {		
		
		System.out.print("---"+data);
	}//displayLink
		
}// Link



class LinkedList{
	public Link first,last;
	
	public LinkedList() {
		first = null;
		last =null;
	}//constructor
	
	public boolean isEmpty() {
		
		return (first ==null);
	}//isEmpty
	
	public void push(int data) {
		Link newNode = new Link(data);
		if(isEmpty()) {
			newNode.next=first;
		}else {
			newNode.next=first;
		}
		first = newNode;
		
	}//push
	
	
		
	public int pop() {
	Link temp = first;
	first = first.next;
	return temp.data;
	
	}//deleteKey
	
	public void displayList() {
	Link current = first;
	while(current!=null) {
		current.displayLink();
		current = current.next;
	}//while
		
		
	}//displayList
	
	
	
}//LinkedList


public class LinkedStack {


	
	
public static void main(String[] args) {
	
	LinkedList ll = new LinkedList();
	ll.push(20);
	ll.push(40);
	System.out.print("Stack(top--->bottom)");
	ll.displayList();
	System.out.println();
	ll.push(60);
	ll.push(80);
	System.out.print("Stack(top--->bottom)");
	ll.displayList();
	System.out.println();
	ll.pop();
	ll.pop();
	System.out.print("Stack(top--->bottom)");
	ll.displayList();
		
	}

}
