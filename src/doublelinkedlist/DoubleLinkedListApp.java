package doublelinkedlist;

import java.util.LinkedList;

class DoubleList{
	
	public int data;
	public DoubleList next, previous;
	
	
	public DoubleList(int data) {
		this.data = data;
	}//constructor
	
	
	public void displayLink() {
		System.out.print(data+ " ");
	}//displayLink
	
}// DoubleList


class DoubleLinkedList{

	public DoubleList first, last,currentNode=first;
	
	public DoubleLinkedList() {
		first = null;
		last = null;
	}//DoubleLinkedList
	
	public boolean isEmpty() {
		return (first ==null);
	}//isEmpty
	
	
	
	public void insertKeyFirst(int data) {
		
		DoubleList newNode = new DoubleList(data);
		
		if(isEmpty()) {
			last = newNode;
		}
		else {
			first.previous = newNode;
			
		}
		
		newNode.next = first;
		first = newNode;
		
	}
	
	public void insertKeyLast(int data) {
		DoubleList newNode = new DoubleList(data);
		
		if(isEmpty()) {
			first = newNode;
			newNode.next = last;
		}//if
		else {
			newNode.previous = last;
			last.next = newNode;
		}//else
		
		last = newNode;
		
		
	}//insertKey
	
	
	public void deleteFirst() {
	
		first.next.previous = null;
		first = first.next;
		
	}
	
	public void deleteLast() {
		
		last.previous.next = null;
		last = last.previous;
	}
	
	
	public DoubleList deleteKey(int key) {
		DoubleList currentNode = first, previous, next;
		while(currentNode.data!=key) {
			currentNode = currentNode.next;
			if(currentNode == null) {
				return null;
			}
		}//while
		
		
		if(currentNode ==first)
			first = currentNode.next;
		else 
			currentNode.previous.next= currentNode.next;
		
		
		if(currentNode == last)
			last = currentNode.previous;
			
		else 
			currentNode.next.previous =currentNode.previous; 
		
			
		return currentNode;
			
}		

	
	public void insertAfter(int data1, int data2) {
		
		DoubleList currentNode= first; 
		
		DoubleList newNode = new DoubleList(data2);
		
		while(currentNode.data!=data1) {
			currentNode= currentNode.next;
		}//while
		
		
		if(currentNode == last) {
			currentNode.next = newNode;
			newNode.previous = currentNode;
		}// element found at the last node
		
		else {
			newNode.next = currentNode.next;
			currentNode.next.previous = newNode;
			
		}// element found at any place other than last position
		
		currentNode.next = newNode;
		newNode.previous = currentNode;
		
	}
	
 	
	
	public void displayForward() {
		currentNode = first;
		while(currentNode!=null) {
		  currentNode.displayLink();
		  currentNode = currentNode.next;
		}//while		
	}//displayForward
	
	
	
	
	public void displayBackward() {
		currentNode = last;
		while(currentNode!=null) {
			currentNode.displayLink();
			currentNode = currentNode.previous;
		}//while
		
		
	}//displayBackward
	
	
}//DoubleLinkedList


public class DoubleLinkedListApp {

	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();
//						
						 dll.insertKeyFirst(22);
						 dll.insertKeyFirst(44);
						 dll.insertKeyFirst(66);
						 				 
						 dll.insertKeyLast(11);
						 dll.insertKeyLast(33);
						 dll.insertKeyLast(55);

						 System.out.print("List (first ---> last)   ");
						 dll.displayForward();
						 System.out.println();
						 System.out.print("List (last ---> first)   ");
						 dll.displayBackward();
						 dll.deleteFirst();
						 dll.deleteLast();
						 
						 dll. deleteKey(11);
						 System.out.println();
						 System.out.print("List (last ---> first)   ");
						 dll.displayForward();
						 
						 
						 dll.insertAfter(22, 77);
						 dll.insertAfter(33,88);
						 System.out.println();
						 System.out.print("List (last ---> first)   ");
						 dll.displayForward();
						 
						 

		
	}
}
