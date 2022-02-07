package binarytrees;

import java.util.ArrayList;

class Node1{
	public int data;
	Node1 left, right;
	
	
	public Node1(int data) {
		
		this.data = data;
		left = right = null;
	}// constructor
	
} // Node1




public class GenerateUniqueBinary {
	
	public static int count;
	
	
	public static ArrayList<Node1> generateBinaryTrees(int n){
		
		if(n==0)
			return generateBinaryTrees(1,0);
		return 	   generateBinaryTrees(1,n);		
		
	}
	
	
	public static ArrayList<Node1> generateBinaryTrees(int start, int end){
		
		ArrayList<Node1> arr_tree = new ArrayList<Node1>();
		
		if(start>end) {
			arr_tree.add(null);
			return arr_tree;
			
		} // if condition
		else {
			
			
			for(int i=start;i<=end;i++) {
				
				for(Node1 left:generateBinaryTrees(start,i-1)) {
					
					for(Node1 right:generateBinaryTrees(i+1,end)) {
						
							Node1 aTree = new Node1(i);
							aTree.left = left;
							aTree.right = right;
							arr_tree.add(aTree);
						
					}// innermost
				
				}	// inner
			
			} //outer for loop
			
			
			
			
		}//else
		
		return arr_tree;
		
}//generateBinaryTrees
	
	
	public static void preorder_display(Node1 root) {
		

			
			if(root!=null) {
			++count;
			System.out.print(root.data+ " ");
			preorder_display(root.left);
			preorder_display(root.right);
					
			}	
			
			
		    //System.out.println();
		
	}
	
	
	
	public static void inorder_display(Node1 root) {
		
			if(root==null)
				return;
		
			
			inorder_display(root.left);
			System.out.println(root.data+ " ");
			inorder_display(root.right);
			
	 
		
			System.out.println();
		
	}
	
	
	
	public static void main(String[] args) {
	
		Node1 node = new Node1(10);
		node.left = new Node1(20);
		node.right = new Node1(30);
		ArrayList<Node1> temp= generateBinaryTrees(7);
		System.out.println(temp);
		for(int i=0;i<temp.size();i++) {
			//inorder_display(temp.get(i));
			preorder_display(temp.get(i));
		System.out.println("-------------------------------");
		}
		
	}
	
}
