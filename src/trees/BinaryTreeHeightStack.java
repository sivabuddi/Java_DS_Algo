package trees;
import java.util.*;
class Node13{
	
	int data;
	Node13 left, right;
	
	public Node13(int data) {
		this.data = data;
		left =null;
		right =null;
	}// constructor
	
	
}// Node13


public class BinaryTreeHeightStack {
	
	public int heightBinaryTree(Node13 root) {
	
		Stack<Node13> stk = new Stack<Node13>();
		
		int max_height= 0;
		
		if(root==null)
			return 0;
		stk.push(root);
		Node13 previous = null;
		while(!stk.isEmpty()) {
			
			Node13 current = stk.peek();
			if(previous == null || previous.left == current || previous.right == current) {
			
				if(current.left!=null)
					stk.push(current.left);
				else if(current.right !=null)
					stk.push(current.right);
				
			}else if(current.left == previous){
				if (current.right!=null)
				stk.push(current.right);
				
			}// else if
			
			else {
				stk.pop();
			}
			previous = current;
			
			if(stk.size()> max_height)
				max_height = stk.size();
			
		}// while
		
		return max_height;
			
	}// heightBinaryTree
	
	
	public static void main(String[] args) {
		BinaryTreeHeightStack tree = new BinaryTreeHeightStack();
		Node13 node = new Node13(10);
		node.left = new Node13(20);
		node.right = new Node13(30);
		int height = tree.heightBinaryTree(node);
		System.out.println("height of a binary tree ="+height);
		
	}// main

}// BinaryTreeHeight
