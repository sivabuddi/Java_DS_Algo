package binarytrees;


public class MaxLeftSubtree {
	
	
	static class BinaryNode3{
		
		public int data;
		public BinaryNode3 left, right;
		
		public BinaryNode3(int data) {
			this.data = data;
			left = null;
			right = null;
			
		}// constructor
		
		
	}// BinaryNode3

	
	
	public static int  findMaxLeft(BinaryNode3 root) {
		
		int leftMin=Integer.MAX_VALUE, rightMin=Integer.MAX_VALUE;
		
		if(root.left==null && root.left == null)
			return root.data;
		
		if(root.left!=null)
			leftMin = findMaxLeft(root.left); 
		
		if(root.right!=null)
			rightMin = findMaxLeft(root.right);
		
		return Math.max(root.data, Math.max(leftMin, rightMin));
		
	}
	
	
	
	

	
	
	public static void main(String[] args) {
		BinaryNode3 node = new BinaryNode3(7);
		node.left = new BinaryNode3(6);
		node.right = new BinaryNode3(5);
		node.left.left = new BinaryNode3(4);
		node.left.right = new BinaryNode3(30);
		node.right.left = new BinaryNode3(2);
		node.right.right = new BinaryNode3(1);
//		node.right.right = new BinaryNode3(50);
//		node.right.left = new BinaryNode3(5);
		System.out.println("Maximum value of binary tree = "+findMaxLeft(node));
		//System.out.println("Minimum value of right sub tree ="+findMinRight(node));
		
	}

}
