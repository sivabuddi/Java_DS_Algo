package trees;

class Node5{
	
	int data;
	Node5 left, right;
	
	public Node5(int data) {
		this.data= data;
		left=null;
		right=null;
	}
	
}// Node5


public class FindMax {
	

	public int maxBinary(Node5 root) {
			
		Node5 temp = root;
		int max_value =0;
		
    if(root!=null) {
		
		int left = maxBinary(temp.left);
		int right = maxBinary(temp.right);
		
		if(left>right)
			max_value=left;
		else 
			max_value=right;
		
		
		if(root.data>max_value)
			max_value=root.data;
	  }//if
		
		return max_value;
		
	}
	
	
	public static void main(String[] args) {
		FindMax tree = new FindMax();
		Node5 node = new Node5(1);
		node.left = new Node5(2);
		node.right = new Node5(3);
		node.left.left = new Node5(40);
		node.left.right = new Node5(5);
		node.right.left = new Node5(6);
		node.right.right= new Node5(7);
		int value=tree.maxBinary(node);
		System.out.println(value);
		
		
	}
	

}
