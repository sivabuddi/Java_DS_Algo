package binarytrees;

class Node4{
	
	int data;
	Node4 left,right;
	
	public Node4(int data) {
		
		this.data = data;
		left = null;
		right = null;
	
	} // constructor
	
	
}// Node

public class SmallestKthElement {
	static int count =0;
	public static Node4 smallestK(Node4 root, int element) {
		
		if(root == null)
			return null;
		
		Node4 left = smallestK(root.left, element);
		
		if(left!=null) {
			return left;
		}
		
		if(++count ==element)
			return root;
		
		return smallestK(root.right, element);
			
		
		
	} // smallestKthElement
	
	public static Node4 insert(Node4 root, int element) {
		
		if(root==null)
		   return new Node4(element);
		
		if(element < root.data)
			root.left = insert(root.left, element);
		
		if(element>root.data)
			root.right = insert(root.right, element);
		
		return root;
		
	}
	
	public static void main(String[] args) {
		
		int keys [] = {20,10,30,5,15,25,40};
		
		Node4 root = null;
		
		for (int i:keys)
			root = insert(root, i);
		
		root = smallestK(root, 5);
		System.out.println("value = "+root.data);
		
	} //  main
	
}// SmallestKtheElement
