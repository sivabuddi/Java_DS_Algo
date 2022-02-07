package generictrees;

class GenericNode1{
	public int data;
	public GenericNode1 left, right;

	public GenericNode1(int data) {

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
	
	
	public void setLeftChild(GenericNode1 node) {
		this.left = node.left;
	}
	
	public GenericNode1 getLeftChild() {
		
		return this.left;
		
	}
	
	
	public void setRightChild(GenericNode1 node) {
		this.right = node.right;
	}
	
	public GenericNode1 getRightChild() {
		
		return this.right;
		
	}
	

}// GenericNode1



public class QuasiIsomorphic {
	
	
	public static boolean quasiIsomorphic(GenericNode1 root1, GenericNode1 root2) {
		
		if(root1 == null && root2 == null)
			return true;
		
		if(root1!=null && root2==null || root1 !=null && root2==null)
			return false;
		
		else {
			return quasiIsomorphic(root1.getLeftChild(), root2.getLeftChild()) && quasiIsomorphic(root1.getRightChild(), root2.getRightChild()) 
						|| quasiIsomorphic(root1.getLeftChild(), root2.getRightChild()) && quasiIsomorphic(root1.getRightChild(), root2.getLeftChild()); 
		}
		
	} // quasiIsomorphic
	
	public static void main(String[] args) {
		
		GenericNode1 node1 = new GenericNode1(10);
		node1.left = new GenericNode1(20);
		node1.right = new GenericNode1(30);
		node1.left.left = new GenericNode1(40);
		node1.left.right = new GenericNode1(50);
		node1.left.right.left =  new GenericNode1(60);
		node1.left.right.left.left =  new GenericNode1(70);
		
		
		GenericNode1 node2 = new GenericNode1(10);
		node2.left = new GenericNode1(20);
		node2.right = new GenericNode1(30);
		node2.left.left = new GenericNode1(40);
		node2.left.right = new GenericNode1(50);
		node2.left.right.left =  new GenericNode1(60);
		node2.left.right.left.left =  new GenericNode1(80);
		
		boolean flag = quasiIsomorphic(node1, node2);
		if(flag)
			System.out.println("Quasi Isomorphic to each other");
		else
			System.out.println("Quasi Isomorphic not to each other");
				
	}// main
	

}// QuasiIsomorphic
	

	