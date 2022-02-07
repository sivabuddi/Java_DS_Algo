package trees;

class Node26{
	
	public char data;
	Node26 left, right;
	
	public Node26(char data) {
		this.data  = data;
		left = null;
		right = null;
		
	}//constructor
	
	
}// Node26

public class InorderPreorder {
	public int index = 0;
	
	public int search(char pre[], int start, int end, char data) {
		int i;
		for(i=start;i<=end;i++) {
			
			if(pre[i]==data)
				return i;
		} // for loop
		
		return i;
	}// search for index which is in order travesal 
	
	public Node26 binaryTreeConstruct(char in[], char pre[], int start,int end) {
		
		if(start>end)
			return null;
		
		Node26 node = new Node26(pre[index++]);
				
		// only one node which is root
		if(start == end)
			return node;
		
		// Else find the index of in order traversal in the tree
		
		int inIndex = search(in,start,end,node.data);
		
		node.left = binaryTreeConstruct(in, pre, start, inIndex-1);
		node.right = binaryTreeConstruct(in, pre, inIndex+1, end);
		
		return node;
		
	}// binaryTreeConstruct
	
	
	public void printInOrder(Node26 root) {
		
		if(root ==null)
			return;
//		
//		while(root!=null) {
			
			printInOrder(root.left);
			System.out.print(root.data+" ");
			printInOrder(root.right);
			
		//}// while
		
		
	}// printInOrder
	
	
	public static void main(String[] args) {
		
		InorderPreorder tree = new InorderPreorder();
		char in[]=new String("DBEAFC").toCharArray();
		char pre[] = new String("ABDECF").toCharArray();
		Node26 root = tree.binaryTreeConstruct(in, pre, 0, in.length-1);
		tree.printInOrder(root);
		
		
	}// main

}// InorderPreorder
