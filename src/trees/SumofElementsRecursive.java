package trees;

class Node23{
	
	public int data;
	Node23 left, right;
	
	
	public Node23(int data) {
		
		this.data =data;
		left = null;
		right = null;
		
	} // constructor
	
} // Node23

public class SumofElementsRecursive {
	
	public int sumOfElements(Node23 root) {
		
		if(root== null)
			return 0;
		
		return root.data+sumOfElements(root.left)+sumOfElements(root.right);
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		SumofElementsRecursive tree = new SumofElementsRecursive();
		Node23 node = new Node23(10);
		Node23 node1 = new Node23(10);
		node1.left = new Node23(20);
		node1.right = new Node23(30);
		node1.left.left = new Node23(40);
		node1.left.right = new Node23(50);
		node1.right.left = new Node23(60);
		node1.right.right =  new Node23(70);
		int sum = tree.sumOfElements(node1);
		System.out.println("sum of all elements in  the binary tree= "+ sum);
		
	}
}
