package binarytrees;

class BinaryNode3{
	
	public int data;
	public BinaryNode3 left, right;
	
	public BinaryNode3(int data) {
		
		this.data = data;
		left = right = null;
	}// constructor
	
}// BinaryNode3


public class IsItBSTorNotusingInorder {
	
	
	public static boolean isItBoolean(BinaryNode3 root, int min, int max) {
		
		if(root==null)
			return true;
		else 
			return ((min<root.data)&&(root.data<max)&&isItBoolean(root.left, min, root.data) && isItBoolean(root.right, root.data, max));
		
		
		
	}// isItBoolean
	
	
	public static void main(String[] args) {
		BinaryNode3 node = new BinaryNode3(20);
		node.left = new BinaryNode3(10);
		node.right = new BinaryNode3(30);
		node.left.left = new BinaryNode3(5);
		node.left.right =new BinaryNode3(50);
		boolean flag = isItBoolean(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
		if(flag)
			System.out.println("It is BST");
		else
			System.out.println("It is not at all BST");
		
	}
	

}// IsItBSTorNot
