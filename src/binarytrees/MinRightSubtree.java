package binarytrees;

import binarytrees.MaxLeftSubtree.BinaryNode3;

public class MinRightSubtree {
	
static class BinaryNode3{
		
		public int data;
		public BinaryNode3 left, right;
		
		public BinaryNode3(int data) {
			this.data = data;
			left = null;
			right = null;
			
		}// constructor
		
		
	}// BinaryNode3



		public static int  findMinRight(BinaryNode3 root) {
	
			int leftMin=Integer.MAX_VALUE, rightMin=Integer.MAX_VALUE;
	
			if(root.left==null && root.left == null)
				return root.data;
	
			if(root.left!=null)
				leftMin = findMinRight(root.left); 
	
			if(root.right!=null)
				rightMin = findMinRight(root.right);
	
			return Math.min(root.data, Math.min(leftMin, rightMin));
	
}


		public static void main(String[] args) {
			BinaryNode3 node = new BinaryNode3(7);
			node.left = new BinaryNode3(6);
			node.right = new BinaryNode3(15);
			node.left.left = new BinaryNode3(4);
			node.left.right = new BinaryNode3(20);
			node.right.left = new BinaryNode3(2);
			node.right.right = new BinaryNode3(111);
			System.out.println("Maximum value of tree = "+findMinRight(node));
			
			
		}
		

}// MinRightSubtree
