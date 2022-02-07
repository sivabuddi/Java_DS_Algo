package trees;
import java.util.*;

class Node16{
	
	int data;
	Node16 left, right;
	
	public Node16(int data) {
		
		this.data = data;
		left = null;
		right = null;
		
	}// constructor

}// Node16

public class DeepestNodeLevel {
	
	public Node16 deepestNode(Node16 root){
		
			Node16 temp= null;
			
			if(root==null)
				return null;
			
			
			Queue<Node16> q = new LinkedList<Node16>();
			q.offer(root);
			while(!q.isEmpty()) {
				
				temp = q.poll();
				
				if(temp.left!=null)
					q.offer(temp.left);
				
				if(temp.right!=null)
					q.offer(temp.right);
				
				
			}// while
			
			return temp;
			
		
	}
	
	public static void main(String[] args) {
		DeepestNodeLevel tree = new DeepestNodeLevel();
		
		Node16 node = new Node16(10);
		node.left = new Node16(20);
		node.right = new Node16(30);
		node.left.left = new Node16(40);
		Node16 temp = tree.deepestNode(node);
		System.out.println("Deepest node ="+ temp.data);
		
	}
}
