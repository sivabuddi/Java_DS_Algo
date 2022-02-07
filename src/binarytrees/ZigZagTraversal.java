package binarytrees;

import java.util.*;

class ZigNode{
	int data;
	ZigNode left, right;
	
	public ZigNode(int data) {
		this.data = data;
		left = null;
		right = null;
	} // constructor
	
	
}// ZigNode


public class ZigZagTraversal {

	public static ArrayList<ArrayList<Integer>> zigZagTraversal(ZigNode root){
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
 		
		Queue<ZigNode> q = new LinkedList<ZigNode>();
		
		q.offer(root);
		q.offer(null);
		boolean leftToRight = true;
		ArrayList<Integer> curr_array= new ArrayList<Integer>();
		
		while(!q.isEmpty()) {
			
			ZigNode temp = q.poll();
		
			if(temp!=null) {
				curr_array.add(temp.data);			
			
			if(temp.left!=null)
				q.offer(temp.left);
		
			if(temp.right!=null)
				q.offer(temp.right);
		
		}// if
		else {
			
			if(leftToRight) {
				
				ArrayList<Integer> c_curr_array= new ArrayList<Integer>(curr_array);
				result.add(c_curr_array);
				curr_array.clear();
				
			}//if
			else {
				Stack<Integer> stk = new Stack<Integer>();
				stk.addAll(curr_array);
				ArrayList<Integer> c_curr_array = new ArrayList<Integer>();
				while(!stk.isEmpty()) {
					c_curr_array.add(stk.pop());
					
				}
				result.add(c_curr_array);
				curr_array.clear();
				
			}//else
			
			if(!q.isEmpty()) {
				q.offer(null);
				leftToRight=!leftToRight;
				}
			
			}//else			
		
		}// while
		

		return result;
		
		
}//zigZagTraversal
	
	
	public static void main(String[] args) {
		ZigNode node = new ZigNode(10);
		node.left = new ZigNode(20);
		node.right = new ZigNode(30);
		node.left.left = new ZigNode(40);
		node.left.right = new ZigNode(50);
		node.right.left = new ZigNode(60);
		node.right.right = new ZigNode(70);
		ArrayList<ArrayList<Integer>> list = zigZagTraversal(node);
		
		for(int i=0;i<list.size();i++) {
			
			for(int j=0;j< list.get(i).size();j++) {
				
				System.out.println(list.get(i).get(j)+" ");
			}
			
		}
		
		
	}
	
}
