package trees;

import java.util.Scanner;



public class BinaryTree1 {
	
	public static class Node{
		
		int data;
		Node left, right;
		
		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	
	}// Node class which inner one	
		
		public void inOrderDisplay(Node root) {
			if(root!=null) {
			inOrderDisplay(root.left);
			System.out.print(root.data+ " ");
			inOrderDisplay(root.right);
			}//if		
			
		}
		
		public void preOrderDisplay(Node root) {
			if(root!=null) {
			System.out.print(root.data+ " ");	
			preOrderDisplay(root.left);
			preOrderDisplay(root.right);
			}//if		
			
		}
		
		public void postOrderDisplay(Node root) {
			if(root!=null) {	
			postOrderDisplay(root.left);
			postOrderDisplay(root.right);
			System.out.print(root.data+ " ");
			}//if		
			
		}
		
		
		public int find(Node root, int key) {
			
			Node current=root;
			
			while(current.data!=key) {
			
				if(key < current.data) {
				    	current = current.left;				  	
				}//left child
				else {
					current = current.right;
				}//right child
				
				if(current ==null){
					return current.data;
				}
				
				
			}//while
			
			return current.data;
			
		}
		
		public void insertNode(Node node, int value) {
			
			
			if(value<node.data) {
				
				if(node.left!=null) {
					insertNode(node.left, value);
					
				}
				else {
				   System.out.println(" Inserted " + value + " to left of " + node.data);	
				   node.left = new Node(value);	
				}
				
			}
			else if(value > node.data) {
				if(node.right !=null) {
					insertNode(node.right, value);
				}
				else {
					System.out.println(" Inserted " + value + " to left of " + node.data);
					node.right = new Node(value);
				}
				
			}//else if
			
			
			
		}
		
		public  void deletedKey(Node root, int key) {
			
			root = deleteNode(root, key);
			//System.out.println("Deleted element" + root.data);
					
		}
		
		
		public static Node min(Node root) {
			
			if (root.left == null)
				return root;
			
			else {
				return min(root.left);
			}
			
			
		}
		
		
		public Node deleteNode(Node root, int key) {
			
			if(root == null)
				return null;
			
			if(key <root.data)
				root.left = deleteNode(root.left, key);
			
			else if(key > root.data)
				root.right = deleteNode(root.right,key);
			
			else {
				
				// node to be deleted have both children 
				if(root.left !=null  && root.right !=null) {
					Node temp = root;
					
					// find minimum from right
					
					Node minNodeForRight = min(temp.right);
					
					// replace current node data with min of right sub tree
					
					root.data = minNodeForRight.data;
					
					// delete minimum node from right
					
					root.right = deleteNode(minNodeForRight, minNodeForRight.data);
					
					
				}//if
				
				// node to be deleted has only left child
				else if (root.left !=null)
					root = root.left;
				// node to be deleted has only right child
				else if (root.right !=null)
					root = root.right;
				// node to be deleted has no child
				else {
					root = null;
				}
				
				
			}//else
		
		 return root;
		}
		
		
		
		int minvalue(Node node) {
			int min = node.data;
			while(node.left !=null) {
				min = node.left.data;
				node = node.left;
			}
		return min;	
		}
		
		
		
	
	
	public static void main(String[] args) {
	
		BinaryTree1 tree = new BinaryTree1();
		Node root = new Node(50);
			 //tree.inOrderDisplay(root);
			 tree.insertNode(root, 30);
			 tree.insertNode(root, 20);
             tree.insertNode(root, 40);
             tree.insertNode(root, 70);
             tree.insertNode(root, 60);
             tree.insertNode(root, 80);
			 tree.inOrderDisplay(root);
			 System.out.println();
			 tree.preOrderDisplay(root);
			 System.out.println();
			 tree.postOrderDisplay(root);
			 System.out.println();
			 System.out.println("Enter the element you want to find");
			 int key = new Scanner(System.in).nextInt();
			 int find = tree.find(root, key);
			 
			 			 
			 if(find ==key) {
				 System.out.println("Element found");
			 }else {
				 System.out.println("Element not found");
			}
			 
			 
			 
			tree.deletedKey(root,key);
			tree.inOrderDisplay(root);
			tree.preOrderDisplay(root); 
			  
			 
	}// main
	
	
	

}
