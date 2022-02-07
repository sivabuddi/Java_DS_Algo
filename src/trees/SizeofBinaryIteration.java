package trees;
import java.util.*;
class Node11{
	
	int data;
	Node11 left, right;
	
	public Node11(int data) {
		this.data = data;
		left =null;
		right =null;
	}// constructor
	
	
}

public class SizeofBinaryIteration {
	
	
	public int sizeOfBinary(Node11 root) {
 
		Queue<Node11> q = new LinkedList<Node11>();
		
		q.offer(root);
		int count = 0;
		
		while(!q.isEmpty()) {
		
			Node11 temp = q.poll();
			
			if(temp.left!=null)
				q.offer(temp.left);
			   
			
			if(temp.right!=null)
				q.offer(temp.right);
			
			count ++;
			
			
		}// while
		
		return count;
		
	}// sizeOfBinary
	
	public static void main(String[] args) {
		
		SizeofBinaryIteration tree = new SizeofBinaryIteration();
		Node11 node = new Node11(10);
		node.left = new Node11(20);
		node.right = new Node11(30);
		node.left.left = new Node11(40);
		node.left.right = new Node11(50);
		node.right.left = new Node11(60);
//		node.right.right = new Node11(70);
		
		int size = tree.sizeOfBinary(node);
		System.out.println("Size of binary tree using iteration = "+size);
				
	}// main
	

} // SizeOfBinary
