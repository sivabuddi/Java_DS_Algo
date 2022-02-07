package binarytrees;

class BinaryNode5{
	
	int data;
	BinaryNode5 left, right;
	
	public BinaryNode5(int data) {
		this.data =data;
		left=null;
		right = null;
	}// constructor
	
}// BinaryNode5


public class Array_BST {
	
	BinaryNode5 root = null;
	
	public static BinaryNode5 convertArraytoBST(int arr[], int start, int end) {
		
		
		if(start>end)
			return null;
		
		
		// create first element using start and end indexing
		
		int mid = (start+end)/2;
		
		BinaryNode5 newNode = new BinaryNode5(arr[mid]);
		
		newNode.left = convertArraytoBST(arr, start, mid-1); // left sub tree
		
		newNode.right = convertArraytoBST(arr, mid+1, end); // right sub tree
		
		
		return newNode;
					
		
	}
	
	public static void preOrder(BinaryNode5 root) {
		
		 if(root==null)
			 return;
		
				
		 System.out.print(root.data+" ");
		 preOrder(root.left);
		 preOrder(root.right);
		
		
	}// preOrder
	
	
	public static void main(String[] args) {
		
	 int arr[] = {5,10,15,20,25,30,40};
	 BinaryNode5 root = convertArraytoBST(arr, 0, arr.length-1);
	 preOrder(root);	
		
	}// main

}// Array_BST
