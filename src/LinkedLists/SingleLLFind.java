package LinkedLists;

import java.util.Scanner;



class Link1{
	
	public int data1;
	public double data2; 
	public Link1 next; // Self Referential Class
	
	
	public Link1(int data1, double data2) {
		this.data1 = data1;
		this.data2 = data2;
	} // constructor
	
	

	public void displayLink() {
		System.out.print(data1 + "----"+data2);
	}
	

}// Link Class



class LinkList1{
	
	private Link1 first;
	
	public LinkList1() {
		first = null;
	}
	 
	public boolean isEmpty() {
		return (first==null);
	}
	
	
	public void insertFirst(int a, double b) {
		Link1 newLink = new Link1(a, b);
		newLink.next= first;
		first=newLink;
	}
	
	public Link1 deleteFirst() {
		Link1 temp=first;
		first=first.next;
		return temp;
		
	}
	
	public Link1 findKey(int key) {
		Link1 link =first;
		
		while(link.data1!=key) {
						
			if(link != null) {
				link = link.next;
			}
			else {
				return null;
			}
			
		}//while
		
		  return link;
	}//findKey	
		
	
	public Link1 deleteKey(int key) {		
	Link1 previous=first, current=first;
	
	while(current.data1!=key) {
		
		if (current.next!=null) {
			previous =current;
			current=current.next;
		}
		else {
			return null;
		}
				
		
	}
	
	if(current == first)
		first  = first.next;
	else
		previous.next = current.next;
		
	return current;	
		
		
	}
	
	
	
	
	public void displayList() {
		System.out.print("List (First--->Last):");
		
		Link1 currentLocation = first;	
		while(currentLocation!=null) {
		currentLocation.displayLink();
		currentLocation= currentLocation.next;
		}//while
		
				
	}//displayList

}// LinkList class 


public class SingleLLFind {
	
	
	
	public static void main(String[] args) {
		
		LinkList1 ll1 = new LinkList1();
				  ll1.insertFirst(11, 22);
				  ll1.insertFirst(33, 44);
				  ll1.insertFirst(55, 66);
				  ll1.insertFirst(77, 88);	  
				  ll1.displayList();	
		 		  	
		System.out.println();		  
		System.out.println("Enter the element you want to find and delete");
		int n = new Scanner(System.in).nextInt();
			Link1 ll2= ll1.findKey(n);

		    
			if(ll2!=null) {
				System.out.println(n+"element  found");
			}
			else {
				System.out.println(" element not found");
			}
			
			
			Link1 ll3 = ll1.deleteKey(n);
			
			if(ll3!=null)
				System.out.println(n + "element deleted");
			else 
				System.out.println("deletion not possible");
			
			ll1.displayList();
			
		
			
			
			
	}

}
