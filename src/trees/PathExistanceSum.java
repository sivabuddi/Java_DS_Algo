package trees;

import java.util.LinkedList;
import java.util.Queue;

class Node22{
	
	int data;
	Node22 left, right;
	
	public Node22(int data) {
		this.data= data;
		left=null;
		right=null;
	}// constructor
	
		
}// Node7


public class PathExistanceSum {
	
	public boolean pathExistance(Node22 root,int sum) {
		
	if(root==null)
		return false;
		
	if (root.left==null && root.right==null && root.data == sum)
		return true;
	else	
		return pathExistance(root.left,sum-root.data) || pathExistance(root.right, sum-root.data);
				
	} // levelSumMax
	
	public static void main(String[] args) {
		
		PathExistanceSum tree = new PathExistanceSum();
		Node22 node1 = new Node22(10);
		node1.left = new Node22(20);
		node1.right = new Node22(30);
		node1.left.left = new Node22(40);
		node1.left.right = new Node22(50);
		node1.right.left = new Node22(60);
		node1.right.right =  new Node22(70);
		boolean flag = tree.pathExistance(node1, 1100);
		if(flag)
		System.out.println("Path available");
		else {
			System.out.println("Path not available");
		}

		
	}// main
	


}// PathExistanceSum