package generictrees;

class GenericNode2{
	public int data;
	public GenericNode2 left, right;

	public GenericNode2(int data) {

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
	
	
	public void setLeftChild(GenericNode2 node) {
		this.left = node.left;
	}
	
	public GenericNode2 getLeftChild() {
		
		return this.left;
		
	}
	
	
	public void setRightChild(GenericNode2 node) {
		this.right = node.right;
	}
	
	public GenericNode2 getRightChild() {
		
		return this.right;
		
	}
	

}// GenericNode2



public class NumberofChildrens {
	
	public static int childCount(GenericNode2 root) {
		
		int count =0;
		GenericNode2 current = root;
		
		while(current!=null) {
			
			count++;
			current = current.getRightChild();
			
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		GenericNode2 node1 = new GenericNode2(10);
		node1.left = new GenericNode2(20);
		node1.right = new GenericNode2(30);
		node1.left.left = new GenericNode2(40);
		node1.left.right = new GenericNode2(50);
		node1.left.right.left =  new GenericNode2(60);
		node1.left.right.left.left =  new GenericNode2(70);
		node1.right.left = new GenericNode2(80);
		node1.right.right = new GenericNode2(90);
		int children= childCount(node1.right.left);
		System.out.println("Number of childrens for a given node "+children);
	}
	

}
