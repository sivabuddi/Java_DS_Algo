package trees;

import java.util.*;
class Node15{
	
	int data;
	Node15 left, right;
	
	public Node15(int data) {
		this.data = data;
		left =null;
		right =null;
	}// constructor
	
	
}// Node15


public class BinaryTreeHeightLevel {
	
	public int heightBinaryTree(Node15 root) {
	
	int max_height =1;
	
	if(root == null)
		return 0;
	
	Queue<Node15> q = new LinkedList<Node15>();
	q.offer(root);
	q.offer(null);
	while(!q.isEmpty()) {
		Node15 currentNode = q.poll();
		
		if(currentNode!=null) {
			
			if(currentNode.left== null && currentNode.right==null)
				return max_height;
			
			
			if(currentNode.left!=null)
				q.offer(currentNode.left);
			
			if(currentNode.right !=null)
				q.offer(currentNode.right);
			
			
		}//if
		else {
			
			if(!q.isEmpty()) {
				max_height++;
				q.offer(null);
				
			}// if
		}//else
		
			
	}// while
		
	return max_height;
	
		
}
	
	
		

	
	
	public static void main(String[] args) {
		BinaryTreeHeightLevel tree = new BinaryTreeHeightLevel();
		Node15 node = new Node15(10);
		node.left = new Node15(20);
		node.right = new Node15(30);
		node.left.left = new Node15(40);
		node.left.right = new Node15(50);
		node.right.left = new Node15(60);
		node.right.right = new Node15(70);
		node.right.right.left = new Node15(90);
		//node.left.left.left = new Node15(567);
		int height = tree.heightBinaryTree(node);
		System.out.println("height of a binary tree ="+height);
		
	}// main

}// BinaryTreeHeight
