package threadedtrees;

 

class ThreadedNode{
	public int data;
	public ThreadedNode left, right;
	public int lTag, rTag;

	public ThreadedNode(int data) {

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
	
	
	public void setLeftChild(ThreadedNode node) {
		this.left = node.left;
	}
	
	public ThreadedNode getLeftChild() {
		
		return this.left;
		
	}
	
	
	public void setRightChild(ThreadedNode node) {
		this.right = node.right;
	}
	
	public ThreadedNode getRightChild() {
		
		return this.right;
		
	}
	

}// ThreadedNode

public class InorderSuccessor {
	
	public static ThreadedNode inorderSuccessor(ThreadedNode root) {
		
		ThreadedNode position = root;
		
		if(root.rTag==0)
			return root.getRightChild();
		
		else {
			
			position = root.getRightChild();
			while(position.lTag==1) {
				position = position.getLeftChild();
						
			}// while
			
			return position;
		
		}// else
		
}// inorderSuccessor
	

	public static void main(String[] args) {
		
		ThreadedNode node1 = new ThreadedNode(10);
		node1.left = new ThreadedNode(20);
		node1.right = new ThreadedNode(30);
		node1.left.left = new ThreadedNode(40);
		node1.left.right = new ThreadedNode(50);
		node1.right.left =  new ThreadedNode(60);
		node1.right.right = new ThreadedNode(70);
		ThreadedNode temp = inorderSuccessor(node1.left);
		System.out.println(temp.getData());
		
		
	}

}// InorderSuccessor
