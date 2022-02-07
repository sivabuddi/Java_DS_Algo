package trees;

class Node19{
		int data;
		Node19 left,right;
		
	public Node19(int data) {
		this.data = data;
		left= null;
		right =  null;
	}//constructor
	
}// class Node19


public class MaximumWidth {
	
	public static int heightBinary(Node19 root) {
		
		if(root== null)
			return 0;
		
		int left = heightBinary(root.left);
		int right = heightBinary(root.right);
		
		return left>right?left+1:right+1;
		
	}
	
	
	public int widthofBinary(Node19 root) {
		
		int height = heightBinary(root);
		int  max =0;
		for(int k=0;k<=height;k++) {
			int temp = width(root,k);
			if(temp>max)
				max =temp;
			
		}// for
		
		return max;
		 
	}// widthofBinary
	
	
	public int width(Node19 root, int depth) {
		
		if(root==null)
			return 0;
		
		if(depth==0)
			return 1;
		
		return width(root.left, depth-1)+width(root.right, depth-1);
		
		
	}// width
	
	
	
	
	public static void main(String[] args) {
		
		MaximumWidth tree = new MaximumWidth();
		Node19 node = new Node19(10);
		node.left = new Node19(20);
		node.right = new Node19(30);
		node.left.left = new Node19(40);
		node.left.right = new Node19(50);
		node.right.left  = new Node19(60);
		node.right.right = new Node19(70);
		int width = tree.widthofBinary(node);
		System.out.println("Width of the binary tree = "+width);
		
		
	}

}
