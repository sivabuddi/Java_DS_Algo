package trees;

class Node12{
	
	int data;
	Node12 left, right;
	
	public Node12(int data) {
		this.data = data;
		left =null;
		right =null;
	}// constructor
	
	
}// Node12


public class BinaryTreeHeight {
	
	public int heightBinaryTree(Node12 root) {
	
	if(root==null)
		return 0;
		
	int left_subtree = heightBinaryTree(root.left);
	int right_subtree = heightBinaryTree(root.right);
	
	return left_subtree > right_subtree?1+left_subtree:1+right_subtree;
		
	}// heightBinaryTree
	
	
	public static void main(String[] args) {
		BinaryTreeHeight tree = new BinaryTreeHeight();
		Node12 node = new Node12(10);
		node.left = new Node12(20);
		node.right = new Node12(30);
		node.left.left = new Node12(40);
		node.left.right = new Node12(50);
		node.right.left = new Node12(60);
		node.right.right = new Node12(70);
		node.right.right.left = new Node12(90);
		int height = tree.heightBinaryTree(node);
		System.out.println("height of a binary tree ="+height);
		
	}// main

}// BinaryTreeHeight
