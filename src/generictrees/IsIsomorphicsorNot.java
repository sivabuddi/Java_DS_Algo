package generictrees;

class GenericNode{
	public int data;
	public GenericNode left, right;

	public GenericNode(int data) {

		this.data = data;
		left = null;
		right=null;
	
	}// constructor
	
	
	public void setData(int data) {
		
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	
	public void setLeftChild(GenericNode node) {
		this.left = node.left;
	}
	
	public GenericNode getLeftChild() {
		
		return this.left;
		
	}
	
	
	public void setRightChild(GenericNode node) {
		this.right = node.right;
	}
	
	public GenericNode getRightChild() {
		
		return this.right;
		
	}
	

}// GenericNode


public class IsIsomorphicsorNot {
	
	
	public static boolean isomorphicOrNot(GenericNode root1, GenericNode root2) {
		
		if(root1 == null && root2 == null)
			return true;
		
		if((root1== null && root2!=null) || (root1!=null && root2==null))
			return false;
		
		else {
			
			return (isomorphicOrNot(root1.getLeftChild(), root2.getLeftChild()) && isomorphicOrNot(root1.getRightChild(), root2.getRightChild()));
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		GenericNode node1 = new GenericNode(10);
		node1.left = new GenericNode(20);
		node1.right = new GenericNode(30);
		node1.left.left = new GenericNode(40);
		node1.left.right = new GenericNode(50);
		node1.left.right.left =  new GenericNode(60);
		
		
		GenericNode node2 = new GenericNode(10);
		node2.left = new GenericNode(20);
		node2.right = new GenericNode(30);
		node2.left.left = new GenericNode(40);
		node2.left.right = new GenericNode(50);
		node2.left.right.left =  new GenericNode(60);
		
		boolean flag = isomorphicOrNot(node1, node2);
		if(flag)
			System.out.println("Isomorphic to eachother");
		else {
			System.out.println("Not isomorphic at all");
		}
		
		
	}	

}
