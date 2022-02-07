package trees;
import java.util.*;

class Node17{
	
	int data;
	Node17 left,right;
	
	public Node17(int data) {
		this.data = data;
		left = null;
		right = null;
	}// constructor
	
}// Node17

public class FullNodesorNot {

	
	public int fullNodeorNot(Node17 root) {
		
		int count  = 0;
		
		Queue<Node17> q = new LinkedList<Node17>();
		q.offer(root);
		
		while(!q.isEmpty()) {
			Node17 temp = q.poll();
			
			if(temp.left!=null && temp.right != null)
				count = count +1;
			
			if(temp.left!=null)
				q.offer(temp.left);
			
			if(temp.right !=null)
				q.offer(temp.right);
			
			
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		FullNodesorNot tree = new FullNodesorNot();
		Node17 node = new Node17(10);
		node.left =  new Node17(20);
		node.right = new Node17(30);
		node.left.left = new Node17(40);
		node.left.right = new Node17(50);
		int count = tree.fullNodeorNot(node);
		System.out.println("Number of full nodes in binary tree "+count);
		
		
	}// main
	
	
}// FullNodesorNot
