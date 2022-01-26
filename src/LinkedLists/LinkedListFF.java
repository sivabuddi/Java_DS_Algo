// Double ended List (Which is different from Doubly Linked List) 
package LinkedLists;

import java.util.Scanner;

class Linked{
	
	public int data;
	public Linked next;
	
	
	public Linked(int data) {
		this.data = data;
	}//Linked
	
		
	public void displayLink() {
	System.out.print("---->" + data);
	}//displayLink
	
	
		
}// Linked


class LinkedList{
	
	private Linked first,last;
	
	public LinkedList() {
		first = null;
		last =null;
	}//LinkedList
	
	public boolean isEmpty() {
		
		return (first == null);
	}//isEmpty
	
	
	public void insertKeyLast(int data) {
	Linked newNode = new Linked(data);
	
	if(isEmpty())
		first=newNode;
	else 
		last.next=newNode;
	
	last=newNode;	

	
	}//insertKeyLast
	
	
	public void insertKeyFirst(int data) {
		
	Linked newNode = new Linked(data);
	
	if(isEmpty()) 
		last=newNode;
	else
		
		newNode.next=first;
	
	first =newNode;
		
	}
	
	
	public Linked findKey(int key) {
		
	Linked currentLocation=first;
	
	while(currentLocation.data!=key) {
		currentLocation=currentLocation.next; 			
	}
	
	if(currentLocation==null)
		return null;
	else {
		return currentLocation;
	}
	
	}
	
	
	
	public Linked delete(int element) {
		
	Linked current = first,previous=first;	
		
	while(current.data!=element) {
		
	if(current.next!=null) {
		previous =current;
		current=current.next;
	}
	else {
		return null;
	}
		
	}//while
	
	previous.next=current.next;
	return current;	
		
	}
	
	
	
	public void displayList() {
		
		Linked current=first;	
		
		while(current!=null) {
			current.displayLink();
			current = current.next;			
		}
		
	}//displayList
	
	
}//LinkedList



public class LinkedListFF {

	public static void main(String[] args) {
	
		LinkedList ll = new LinkedList();
		System.out.println("Enter how many elements you want to enter into front portion of list");
		int n=new Scanner(System.in).nextInt();
		
				 for(int i =0;i<n;i++) {	
				  int element =  new Scanner(System.in).nextInt(); 
					 ll.insertKeyFirst(element);
				 }
				   ll.displayList();
		
		System.out.println();		   
		System.out.println("Enter how many elements you want to enter into last portion of list");
		int n1=new Scanner(System.in).nextInt();
					
				for(int i =0;i<n1;i++) {	
					int element =  new Scanner(System.in).nextInt(); 
					ll.insertKeyLast(element);
				}
					ll.displayList();
		System.out.println();
		System.out.println("Enter the elmement you want to search");
		n1=new Scanner(System.in).nextInt();		   
		Linked temp=ll.findKey(n1);
		
		if(temp!=null)
			System.out.println(" element found");
		else {
			System.out.println("element not found");
		}
		
		System.out.println();
		System.out.println("Enter the elmement you want to delete");
		n1=new Scanner(System.in).nextInt();		   
		Linked ld=ll.delete(n1);
		System.out.println();
		ll.displayList();
		
		
				   
	}//main
	
	
}//LinkedListFF
