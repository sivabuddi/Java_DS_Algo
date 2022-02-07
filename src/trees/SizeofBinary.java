package trees;

class Node10{
	
	int data;
	Node10 left, right;
	
	public Node10(int data) {
		this.data = data;
		left =null;
		right =null;
	}// constructor
	
	
}

public class SizeofBinary {
	
	
	public int sizeOfBinary(Node10 root) {
		
		int left = root.left == null?0:sizeOfBinary(root.left);
		int right = root.right == null?0:sizeOfBinary(root.right);
		
		return 1+left+right;
		
		
	}// sizeOfBinary
	
	public static void main(String[] args) {
		
		SizeofBinary tree = new SizeofBinary();
		Node10 node = new Node10(10);
		node.left = new Node10(20);
		node.right = new Node10(30);
		node.left.left = new Node10(40);
		node.left.right = new Node10(50);
		node.right.left = new Node10(60);
		node.right.right = new Node10(70);
		
		int size = tree.sizeOfBinary(node);
		System.out.println("Size of binary tree = "+size);
				
	}// main
	

} // SizeOfBinary
