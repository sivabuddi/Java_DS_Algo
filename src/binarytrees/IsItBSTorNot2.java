package binarytrees;

class BinaryNode2{
	
	public int data;
	public BinaryNode2 left, right;
	
	public BinaryNode2(int data) {
		
		this.data = data;
		left = right = null;
	}// constructor
	
}// BinaryNode2


public class IsItBSTorNot2 {
	
	
	public static boolean isItBoolean(BinaryNode2 root) {
		
		if(root==null)
			return true;
		
		if(root.left!=null &&  findMaxLeft(root.left)> root.data)
			return false;
		
		if(root.right!=null && findMinRight(root.right) < root.data)
			return false;
		
		if(!isItBoolean(root.left)|| !isItBoolean(root.right))
			return false;
		
		return true;
		
		
		
	}// isItBoolean
	
	
	
	
	
	
	public static int  findMaxLeft(BinaryNode2 root) {
		
		int leftMax=0, rightMax=0;
		
		if(root.left==null && root.left == null)
			return root.data;
		
		if(root.left!=null)
			leftMax = findMaxLeft(root.left); 
		
		if(root.right!=null)
			rightMax = findMaxLeft(root.right);
		
		return Math.max(root.data, Math.max(leftMax, rightMax));
		
		
	}
	

	
	
	
	
	public static int findMinRight(BinaryNode2 root) {
		int leftMin=0, rightMin=0;
		
		if(root.left==null && root.left == null)
			return root.data;
		
		if(root.left!=null)
			leftMin = findMaxLeft(root.left); 
		
		if(root.right!=null)
			rightMin = findMaxLeft(root.right);
		
		return Math.min(root.data, Math.min(leftMin, rightMin));
		
		
	}
	
	

	
	
	public static void main(String[] args) {
		BinaryNode2 node = new BinaryNode2(20);
		node.left = new BinaryNode2(10);
		node.right = new BinaryNode2(30);
		node.left.left = new BinaryNode2(5);
		node.left.right =new BinaryNode2(15);
		node.right.left = new BinaryNode2(18);
		node.right.right = new BinaryNode2(40);
		boolean flag = isItBoolean(node);
		if(flag)
			System.out.println("It is BST");
		else
			System.out.println("It is not at all BST");
		
	}
	

}// IsItBSTorNot
