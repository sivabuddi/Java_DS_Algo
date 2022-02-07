package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node9{
	
	int data;
	Node9 left, right;
	
	public Node9(int data) {
		this.data= data;
		left=null;
		right=null;
	}
	
}// Node9


public class InsertNodeBinary {

	public Node9 insertNodeBinary(Node9 root, int key) {
		
		Queue<Node9> q  = new LinkedList<Node9>();
		
	    if(root==null)
	    	return null;
		
	    q.offer(root);
	    
	    while(!q.isEmpty()) {
	    	
	    	Node9 temp = q.poll();
	    	
	    	if(temp!=null) {
	    		
	    		if(temp.left!=null)
	    			q.offer(temp.left);
	    		else {
					temp.left = new Node9(key);
					return root;
				}
	    		
	    	}// if
	    	
	    	
	    	if(temp!=null) {
	    		
	    		if(temp.right!=null)
	    			q.offer(temp.right);
	    		else {
					temp.right= new Node9(key);
					return root;
				}
	    		
	    	}//if
	    		
	    		
	    		
	    	    	
	    }// wile
		
	    return root;
}
	
	
	
	public static void main(String[] args) {
		
		
		InsertNodeBinary tree = new InsertNodeBinary();		
		Node9 node = new Node9(1);
		//node.left = new Node9(2);
		node.right = new Node9(3);
//		node.left.left = new Node9(4);
//		node.left.right = new Node9(5);
//		node.right.left = new Node9(6);
//		node.right.right= new Node9(7);
		System.out.println("Ente the key value");
		int key = new Scanner(System.in).nextInt();
		Node9 current = tree.insertNodeBinary(node, key);
		System.out.println(current.left.data);
		
		
		
	}
	
	
}
