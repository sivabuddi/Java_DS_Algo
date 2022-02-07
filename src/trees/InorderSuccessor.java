package trees;

import java.util.*;

class Node29{
	
	int data;
	Node29 left, right;
	
	public Node29(int data) {
		
		this.data = data;
		left = null;
		right = null;
	}
	
}


public class InorderSuccessor {
	
	public static Node29 inorderSuccessor(Node29 root) {

		Node29 current=null;
		
		Stack<Node29> stk = new Stack<Node29>();
		
		if(root!=null)
			current =root;
		
		if(root.right==null)
			current = stk.pop();
		else {
			current = current.right;
			while(current.left!=null) {
				stk.push(current);
			current = current.left;
			}
			
			
		}
		
		return current;
	}
	
	public static void main(String[] args) {
		
		Node29 node = new Node29(10);
		node.left = new Node29(20);
		node.right = new Node29(30);
		node.left.left = new Node29(40);
		Node29 temp = inorderSuccessor(node);
		System.out.println("preorder successor of a given node = "+ temp.data);
		
	}
	

}
