package LinkedLists;
import java.util.LinkedList;

public class LinkedListInbuilt {
	
	// Main driver method
    public static void main(String args[])
    {
        // Creating object of the
        // class linked list
        LinkedList <String> ll = new LinkedList <String>();
 
        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("L");
        ll.addFirst("F");
        ll.add(2, "E");
        System.out.println(ll);
        ll.offer("A");
        System.out.println(ll);
        ll.poll();
        
 
        System.out.println(ll);
        ll.poll();
        ll.poll();
        System.out.println(ll);
        
        
 

    } // main

}
