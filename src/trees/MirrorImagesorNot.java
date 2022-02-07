package trees;

class Node25{
	
	public int data;
	Node25 left, right;
	
	
	public Node25(int data) {
		
		this.data =data;
		left = null;
		right = null;
		
	} // constructor
	
} // Node25


public class MirrorImagesorNot {
	
	public boolean mirrorImagesorNot(Node25 root1, Node25 root2) {
		
		if(root1 == null && root2 == null)
			return true;
		
		if(root1== null || root2 == null)
			return false;
		
		if(root1.data!= root1.data)
			return false;
		else
		
		return mirrorImagesorNot(root1.left, root2.right) && mirrorImagesorNot(root1.right, root2.left);
		
		
		
	}// mirrorImagesorNot
	
	
	public static void main(String[] args) {
		MirrorImagesorNot tree = new MirrorImagesorNot();
		Node25 node1 = new Node25(10);
		node1.left = new Node25(20);
		node1.right = new Node25(30);
		node1.left.left = new Node25(40);
		node1.left.right = new Node25(50);
		node1.right.left = new Node25(60);
		node1.right.right =  new Node25(70);
		
		Node25 node2 = new Node25(10);
		
		node2.left = new Node25(30);
		node2.right = new Node25(20);
		node2.left.left = new Node25(50);
		node2.left.right = new Node25(40);
		node2.right.left = new Node25(70);
		node2.right.right =  new Node25(60);
		
		boolean flag = tree.mirrorImagesorNot(node1, node2);
		
		if(flag)
			System.out.println("Both are mirror images to each other");
		else {
			System.out.println("No mirror images");
		}
		
		
		
	}// main

} // MirrorImagesorNot
