package LinkedLists;

class Link{
	
	public int data1;
	public double data2; 
	public Link next; // Self Referential Class
	
	
	public Link(int data1, double data2) {
		this.data1 = data1;
		this.data2 = data2;
	} // constructor
	
	

	public void displayLink() {
		System.out.print(data1 + "----"+data2);
	}
	

	
}// Link Class



class LinkList{
	
	private Link first;
	
	public LinkList() {
		first = null;
	}
	 
	public boolean isEmpty() {
		return (first==null);
	}
	
	
	public void insertFirst(int a, double b) {
		Link newLink = new Link(a, b);
		newLink.next= first;
		first=newLink;
	}
	
	public Link deleteFirst() {
		Link temp=first;
		first=first.next;
		return temp;
		
	}
	
	
	
	public void displayList() {
		System.out.print("List (First--->Last):");
		
		Link currentLocation = first;	
		while(currentLocation!=null) {
		currentLocation.displayLink();
		currentLocation= currentLocation.next;
		}//while
		
				
	}//displayList
	

}// LinkList class 



public class SingleLL {
	
	
	public static void main(String[] args) {
		
		LinkList sll = new LinkList();
				 sll.insertFirst(11, 11.00);
				 sll.insertFirst(22,22.00);
				 sll.insertFirst(33, 33.00);
				 sll.insertFirst(44, 44.00);
				 
				 System.out.println("Original List");				 
				 sll.displayList();
				 
				 
				 
		Link ll;		 
				System.out.println();
		 System.out.println("Deleting elements one by one in a list");	
				 while(!sll.isEmpty()) {			 	 
				 ll=sll.deleteFirst();
				 ll.displayLink();
				 
				 }//while
				 System.out.println();
				 System.out.println("After Deletion");
				 sll.displayList();
				 
				 //sll.displayList();
	}// main
	

}// SingleLL
