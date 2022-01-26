package LinkedLists_Stacks;

import java.util.Scanner;

class SortedLink{
	
	public int data;
	public SortedLink next;
	
	public SortedLink(int data) {
		this.data = data;
	}
	
	
	public void displayLink() {
		System.out.print("---"+data);
	}
	
}//SortedLink


class SortedLinked_List{
	
	private SortedLink first,last;
	
	public SortedLinked_List() {
		first = null;
		last = null;
	}
	
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	
	// sorted the linked list while inserting the elements
	public void insertKey(int data) {
	SortedLink newNode = new SortedLink(data);
	SortedLink currentNode = first, previousNode=null;
	
	while(currentNode!=null && currentNode.data < data) {
		previousNode = currentNode;
		currentNode = currentNode.next;	
	}
	
	if(previousNode==null)
		first=newNode;
	else 
		previousNode.next=newNode;
	
	newNode.next=currentNode;
	
	
	}//insert
	
	
	public void deleteKey(int data) {
	SortedLink currentNode =first, previous=null;
	
	
	while(currentNode.data!=data) {
	previous = currentNode;
	currentNode= currentNode.next;
	}//while
	
	if(previous==null) {
	first= currentNode.next;
	}
	else {
	previous.next = currentNode.next;	
	currentNode = currentNode.next;
	}
	
	
	
	}//deleteKey
	
	

	public void displayList() {
		SortedLink currentNode=first;
		while(currentNode!=null) {
		currentNode.displayLink();
		currentNode=currentNode.next;
		}//while
		
	}//displayList
	
	
	
	
}//SortedLinked_List


public class SortedLinkedList {
	
	public static void main(String[] args) {
		SortedLinked_List sll = new SortedLinked_List();
		System.out.println("Enter the number of elements you want to sort");
		int n = new Scanner(System.in).nextInt();
		int data;
		System.out.println("Enter "+ n + " elements");
		for(int i=0;i<n;i++) {
		data = new Scanner(System.in).nextInt();	
			sll.insertKey(data);
		}
		
		System.out.println();
		sll.displayList();
		System.out.println();
		System.out.println("Enter the number of elements that you want to delete");
		n = new Scanner(System.in).nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+ (i+1) + " element");
			data = new Scanner(System.in).nextInt();	
				sll.deleteKey(data);
				sll.displayList();
			System.out.println();
			}
		
						  
	}//main
	

}//SortedLinkedList
