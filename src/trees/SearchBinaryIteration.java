package trees;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Node8{
	
	int data;
	Node8 left, right;
	
	public Node8(int data) {
		this.data= data;
		left=null;
		right=null;
	}
	
}// Node8


public class SearchBinaryIteration {
	

	public boolean searchBinary(Node8 root, int key) {
		
		boolean status = false;
		
		Queue<Node8> q = new LinkedList<Node8>();
		
		Node8 temp = root;
		
		q.offer(root);
		
		while(!q.isEmpty()) {
		
			temp = q.poll();
			
			if(temp.data == key)
				return true;
			
			if (temp!=null) {
			
				if(temp.left!=null)
					q.offer(temp.left);
			
				
				if(temp.right!=null)
					q.offer(temp.right);
			
			}// if	
			
			
		}// while
		return false;	
			
	} // searchBinary
	
	
	public static void main(String[] args) {
		SearchBinaryIteration tree = new SearchBinaryIteration();
		Node8 node = new Node8(1);
		node.left = new Node8(2);
		node.right = new Node8(3);
		node.left.left = new Node8(4);
		node.left.right = new Node8(5);
		node.right.left = new Node8(6);
		node.right.right= new Node8(7);
		System.out.println("Enter the value you want to search");
		int key = new Scanner(System.in).nextInt();
		boolean value=tree.searchBinary(node,key);
		if(value)
			System.out.println(key + " found in the binary tree");
		else 
			System.out.println(key+ " not found in the binary tree");
		
				
	} //  main
	

}// SearchBinaryIteration


