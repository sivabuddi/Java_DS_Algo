package trees;


class Node14{
	
	int data;
	Node14 left, right;
	
	public Node14(int data) {
		this.data= data;
		left=null;
		right=null;
	}// constructor
	
		
}// Node7


public class IdenticalTrees {
	public boolean checkIdenticalTrees(Node14 root1, Node14 root2) {
		
		
		if (root1 == null && root2 == null)
			return true;
		
		if (root1 == null ||  root2 ==  null)
			return false;
		
		return checkIdenticalTrees(root1.left, root2.left) && checkIdenticalTrees(root1.right, root2.right);

	}	
	public static void main(String[] args) {
		
		IdenticalTrees tree = new IdenticalTrees();
		Node14 node1 = new Node14(1);
		node1.left = new Node14(2);
		node1.right = new Node14(3);
		node1.left.left = new Node14(45);
		
		Node14 node2 = new Node14(1);
		node2.left = new Node14(2);
		node2.right = new Node14(3);
		node2.left.left = new Node14(32);
		
		boolean flag = tree.checkIdenticalTrees(node1, node2);
		
		if(flag)
			System.out.println("Identical trees");
		else 
			System.out.println("not identical trees");
		
	}// main
	


}// IdenticalTrees
