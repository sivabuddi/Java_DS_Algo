package trees;

import java.util.LinkedList;
import java.util.Queue;

class Node20{
	
	int data;
	Node20 left, right;
	
	public Node20(int data) {
		this.data= data;
		left=null;
		right=null;
	}// constructor
	
		
}// Node7


public class MaxLevelSum {
	
	public int levelMaxSum(Node20 root) {
		
		int flag = 0;
		
		if(root==null)
			return 0;
		
		Queue<Node20> q = new LinkedList<Node20>();
		q.offer(root);
		 
		
		
		
		int result = root.data; // intial value to compare which is root node
		
		while(!q.isEmpty()) {
			
			int count = q.size();
			int max_sum =0;		
			
			while(count-- > 0) {
				
			Node20 current = q.poll();	
			
			max_sum = max_sum+current.data;
				
			
			if(current.left!=null)
				q.add(current.left);
				
			if(current.right!=null)
				q.add(current.right);
			
			result = Math.max(max_sum, result);
					
				
			}// while
			
			
			
		}// while
		
		return result;
		
	} // levelSumMax
	
	public static void main(String[] args) {
		
		MaxLevelSum tree = new MaxLevelSum();
		Node20 node1 = new Node20(10);
		node1.left = new Node20(200);
		node1.right = new Node20(30);
		node1.left.left = new Node20(40);
		node1.left.right = new Node20(50);
		node1.right.left = new Node20(60);
		node1.right.right =  new Node20(70);
		int max_sum = tree.levelMaxSum(node1);
		System.out.println("Maximum sum of at any level in binary tree = " + max_sum);

		
	}// main
	


}// MaxLevelSum