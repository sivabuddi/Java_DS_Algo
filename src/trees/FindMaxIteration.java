package trees;

import java.util.LinkedList;
import java.util.Queue;

class Node6{
	
	int data;
	Node6 left, right;
	
	public Node6(int data) {
		
		this.data = data;
		left = null;
		right = null;
	}
	
}


public class FindMaxIteration {
	
 
	public int maxBinary(Node6 root) {
		
		Node6 temp = root;
		
		int max_value = Integer.MIN_VALUE;
		
		if (root==null)
			return Integer.MIN_VALUE;
		
		Queue<Node6> q = new LinkedList<Node6>();
		
		q.offer(root);
		
		while(!q.isEmpty()) {
		
			temp = q.poll();
			
			if(max_value<temp.data)
				max_value = temp.data;
			 
			if(temp.left !=null)
				q.add(temp.left);
			
			if(temp.right!=null)
				q.add(temp.right);
			
			
		}
		
				
		return max_value;
		
	}
	
	
	public static void main(String[] args) {
		
		
		FindMaxIteration tree = new FindMaxIteration();
		Node6 node = new Node6(1);
		node.left = new Node6(2);
		node.right = new Node6(3);
		node.left.left = new Node6(4);
		node.left.right = new Node6(555);
		node.right.left = new Node6(6);
		node.right.right= new Node6(7);
		int value=tree.maxBinary(node);
		System.out.println("Maximum value="+value);
		
		
		
	}

}
