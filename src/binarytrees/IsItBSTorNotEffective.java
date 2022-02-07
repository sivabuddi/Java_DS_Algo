package binarytrees;

class BinaryNode4{
	
	public int data;
	public BinaryNode4 left, right;
	
	public BinaryNode4(int data) {
		
		this.data = data;
		left = right = null;
	}// constructor
	
}// BinaryNode4


public class IsItBSTorNotEffective {
	
	public static int prev = Integer.MIN_VALUE;
	
	public static boolean  checkValBST(BinaryNode4 root) {
		return isItBoolean(root);
		
		
	}
	
	public static boolean isItBoolean(BinaryNode4 root) {
		
		if(root==null)
			return true;
		
		if(!isItBoolean(root.left))
			return false;
		
		if(root.data<prev)
			return false;
		
		 prev = root.data;
		 
		 return isItBoolean(root.right);
		
		
	}// isItBoolean
	
	
	public static void main(String[] args) {
		BinaryNode4 node = new BinaryNode4(20);
		node.left = new BinaryNode4(10);
		node.right = new BinaryNode4(30);
		node.left.left = new BinaryNode4(5);
		node.left.right =new BinaryNode4(50);
		boolean flag = checkValBST(node);
		if(flag)
			System.out.println("It is BST");
		else
			System.out.println("It is not at all BST");
		
	} // main
	

}// IsItBSTorNot
