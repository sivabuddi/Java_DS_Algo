package binarytrees;

class Node2{
	
	public int data;
	Node2 left, right;
	
	public Node2(int data) {
		
		this.data = data;
		left = null;
		right =null;
	}// constructor
	
}// Node1

public class LeastCommonAncestor {

	public static Node2 LCA(Node2 root, Node2 a, Node2 b) {
		
		if(root==null)
			return root;
		
		if(root==a || root ==b)
			return root;
		
		Node2 left = LCA(root.left, a, b);
		Node2 right = LCA(root.right,a,b);
		
		if(left!=null && right!=null)
			return root;
		else
		
		return(left!=null?left:right);
		
		
		
		
	}// LCA
	
	public static void main(String[] args) {
		Node2 node1= new Node2(10);
		node1.left = new Node2(20);
		node1.right = new Node2(30);
		node1.left.left = new Node2(40);
		node1.left.right = new Node2(50);
		node1.left.left.left = new Node2(60);
		node1.right.left = new Node2(70);


		
		Node2 temp = LCA(node1, node1.left, node1.right);
		
		System.out.print(temp.data);
		
	}// main
	
	
}// LeastCommonAncestor
