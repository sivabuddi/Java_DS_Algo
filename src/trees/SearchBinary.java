package trees;

import java.util.Scanner;

class Node7{
	
	int data;
	Node7 left, right;
	
	public Node7(int data) {
		this.data= data;
		left=null;
		right=null;
	}
	
}// Node7


public class SearchBinary {
	

	public boolean searchBinary(Node7 root, int key) {
		
		boolean status = false;
		
		Node7 temp = root;
		
		while(temp!=null) {
		
			if(temp.data==key) {
				status = true;
				return status;
			}
		
			else  
			return searchBinary(temp.left, key) || searchBinary(temp.right, key);
		}
		
		return status;		
	}
	
	
	public static void main(String[] args) {
		SearchBinary tree = new SearchBinary();
		Node7 node = new Node7(1);
		node.left = new Node7(2);
		node.right = new Node7(3);
		node.left.left = new Node7(4);
		node.left.right = new Node7(5);
		node.right.left = new Node7(6);
		node.right.right= new Node7(7);
		System.out.println("Enter the value you want to search");
		int key = new Scanner(System.in).nextInt();
		boolean value=tree.searchBinary(node,key);
		if(value)
			System.out.println(key + " found in the binary tree");
		else 
			System.out.println(key+ " not found in the binary tree");
		
				
	}
	

}


