package binarytrees;

class BinaryNode{
	
	public int data;
	public BinaryNode left, right;
	
	public BinaryNode(int data) {
		
		this.data = data;
		left = right = null;
	}// constructor
	
}// BinaryNode


public class IsItBSTorNot {
	
	
	public static boolean isItBoolean(BinaryNode root) {
		
		if(root==null)
			return true;
		
		if(root.left!=null && root.left.data > root.data)
			return false;
		
		if(root.right!=null && root.right.data < root.data)
			return false;
		
		if(!isItBoolean(root.left)|| !isItBoolean(root.right))
			return false;
		
		return true;
		
		
		
	}// isItBoolean
	
	
	public static void main(String[] args) {
		BinaryNode node = new BinaryNode(20);
		node.left = new BinaryNode(10);
		node.right = new BinaryNode(30);
		node.left.left = new BinaryNode(5);
		node.left.right =new BinaryNode(50);
		boolean flag = isItBoolean(node);
		if(flag)
			System.out.println("It is BST");
		else
			System.out.println("It is not at all BST");
		
	}
	

}// IsItBSTorNot
