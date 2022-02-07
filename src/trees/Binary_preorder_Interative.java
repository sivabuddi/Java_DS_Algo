package trees;
import java.util.Stack;


class Node1{
		
		int data;
		
		Node1 left, right;
		
		public Node1(int data) {
			this.data = data;
			left = null;
			right =null;
		}// constructor
			
		
}// Node1

public class Binary_preorder_Interative {
	
	
	Node1 root;
	
	public void inorder_traversal() {
		
		if(root==null)
			return;
		
		Stack <Node1> s = new Stack<Node1>();
		Node1 current = root;
		
		System.out.println();
		
		// traverse the tree
		
		while(current!=null || s.size()>0) {
			
			
			// reach the left most of the current node
			
			while(current!=null) {
				
				System.out.print(current.data + " ");
				s.push(current);
				current = current.left;
				
			}// while
			
			current= s.pop();
			
			
			
			// Now it's turn to right sub tree
			
			current = current.right;
			
		}// while
		
		
		
	}// inorder_traversal
	
	
	public static void main(String[] args) {
		
		Binary_preorder_Interative tree = new Binary_preorder_Interative();
		tree.root= new Node1(1);
		tree.root.left = new Node1(2);
		tree.root.right = new Node1(3);
		tree.root.left.left= new Node1(4);
		tree.root.left.right = new Node1(5);
		
		tree.inorder_traversal();
		
	}// main
	
	
}// Binary_Inorder_Iterative

