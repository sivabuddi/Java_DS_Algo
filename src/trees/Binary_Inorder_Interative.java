package trees;
import java.util.Stack;


class Node3{
		
		int data;
		
		Node3 left;

		Node3 right;
		
		public Node3(int data) {
			this.data = data;
			left = null;
			right =null;
		}// constructor
			
		
}// Node3

public class Binary_Inorder_Interative {
	
	
	Node3 root;
	
	public void inorder_traversal() {
		
		if(root==null)
			return;
		
		Stack <Node3> s = new Stack<Node3>();
		Node3 current = root;
		
		
		System.out.print("Inorder traversal: ");
		// traverse the tree
		
		while(current!=null || s.size()>0) {
			
			
			// reach the left most of the current node
			
			while(current!=null) {
				
				s.push(current);
				current = current.left;
				
			}// while
			
			current= s.pop();
			
			System.out.print(current.data+" ");
			
			// Now it's turn to right sub tree
			
			current = current.right;
			
		}// while
		
		
		
	}// inorder_traversal
	
	
	public static void main(String[] args) {
		
		Binary_Inorder_Interative tree = new Binary_Inorder_Interative();
		tree.root= new Node3(1);
		tree.root.left = new Node3(2);
		tree.root.right = new Node3(3);
		tree.root.left.left= new Node3(4);
		tree.root.left.right = new Node3(5);
		
		tree.inorder_traversal();
		
	}// main
	
	
}// Binary_Inorder_Iterative

