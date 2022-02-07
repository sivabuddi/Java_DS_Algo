package trees;
import java.util.*;

class Nodes{
	
	public int data;
	public Nodes left, right;
	
	public Nodes(int data) {
		this.data = data;
	}// constructor
	
	
}// Nodes

public class BFS {
	
	public Nodes levelOrderSearch(Nodes root) {
		
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		Queue<Nodes> q = new LinkedList<Nodes>();
		if (root==null)
			return null;
		q.offer(root);
		q.offer(null); // for else condition
		
		while(!q.isEmpty()) {
			Nodes current = q.poll();
			
			if(current!=null) {
				System.out.print(current.data+ " ");
				
				if(current.left!=null)
					q.offer(current.left);
				
				if(current.right!=null)
					q.offer(current.right);	
			}
			else {
				
			}
			
			
			
		}// while
		
			
		
		
		return null;
	}//levelOrderSearch
	
	
	public static void main(String[] args) {
		
		BFS tree = new BFS();
		Nodes node= new Nodes(10);
		node.left = new Nodes(20);
		node.right = new Nodes(30);
		node.left.left = new Nodes(40);
		node.left.right = new Nodes(50);
		node.right.left = new Nodes(60);
		node.right.right = new Nodes(70);
		Nodes temp = tree.levelOrderSearch(node);
		
	}// main
	
	
}// BFS
