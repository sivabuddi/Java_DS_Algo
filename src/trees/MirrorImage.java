package trees;

class Node24{
	
	public int data;
	Node24 left, right;
	
	
	public Node24(int data) {
		
		this.data =data;
		left = null;
		right = null;
		
	} // constructor
	
} // Node24

public class MirrorImage {
	
	public  void swap(Node24 root1, Node24 root2) {
		
		Node24 temp = root1.left;
		root1.left = root2.right;
		root2.right = temp;
		
	}
	
	public void convertMirror(Node24 root) {
		 
		
		if(root!=null){
			convertMirror(root.left);
			convertMirror(root.right);
			swap(root,root);
//			Node24 temp = root.left;
//			root.left = root.right;
//			root.right = temp;
			
			
		}// if
		
		
	}// convertMirror
	
	

	
	
	public static void main(String[] args) {
		
		MirrorImage tree = new MirrorImage();
		Node24 node1 = new Node24(10);
		node1.left = new Node24(20);
		node1.right = new Node24(30);
		node1.left.left = new Node24(40);
		node1.left.right = new Node24(50);
		node1.right.left = new Node24(60);
		node1.right.right =  new Node24(70);
		tree.convertMirror(node1);
		System.out.println(node1.left.data);
		
		
	}
}
