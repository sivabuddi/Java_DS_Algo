package trees;
import java.util.*;

class Node18{
	
	int data;
	Node18 left,right;
	
	public Node18(int data) {
		this.data = data;
		left = null;
		right = null;
	}// constructor
	
}// Node18

public class SingleChildorNot {

	
	public int fullNodeorNot(Node18 root) {
		
		int count  = 0;
		
		Queue<Node18> q = new LinkedList<Node18>();
		q.offer(root);
		
		while(!q.isEmpty()) {
			Node18 temp = q.poll();
			
			if((temp.left!=null && temp.right == null) || (temp.left== null && temp.right!=null))
				count = count +1;
			
			if(temp.left!=null)
				q.offer(temp.left);
			
			if(temp.right !=null)
				q.offer(temp.right);
			
			
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		SingleChildorNot tree = new SingleChildorNot();
		Node18 node = new Node18(10);
		node.left =  new Node18(20);
		//node.right = new Node18(30);
		node.left.left = new Node18(40);
		//node.left.right = new Node18(50);
		int count = tree.fullNodeorNot(node);
		System.out.println("Number of single child in binary tree "+count);
		
		
	}// main
	
	
}// FullNodesorNot
