package trees;
import java.util.*;

class Nodes1{
	
	public int data;
	public Nodes1 left, right;
	
	public Nodes1(int data) {
		this.data = data;
	}// constructor
	
	
}// Nodes1

public class BFS1 {
	
	public ArrayList<ArrayList<Integer>> levelOrderSearch(Nodes1 root) {
		
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		Queue<Nodes1> q = new LinkedList<Nodes1>();
		if (root==null)
			return null;
		q.offer(root);
		q.offer(null); // for else condition
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while(!q.isEmpty()) {
			Nodes1 current = q.poll();
			
			if(current!=null) {
				arr.add(current.data);
				
				if(current.left!=null)
					q.offer(current.left);
				
				if(current.right!=null)
					q.offer(current.right);	
			}// if
			else {
				ArrayList<Integer> c_arr = new ArrayList<Integer>(arr);
				result.add(c_arr);
				arr.clear();
				if(!q.isEmpty())
					q.offer(null);
				
				
			}// else
			
			
		}// while	
		
		return result;
	}//levelOrderSearch
	
	
	public static void main(String[] args) {
		
		BFS1 tree = new BFS1();
		Nodes1 node= new Nodes1(10);
		node.left = new Nodes1(20);
		node.right = new Nodes1(30);
		node.left.left = new Nodes1(40);
		node.left.right = new Nodes1(50);
		node.right.left = new Nodes1(60);
		node.right.right = new Nodes1(70);
		ArrayList<ArrayList<Integer>> temp = tree.levelOrderSearch(node);
		
		//System.out.println(temp.get(1).get(0));
		
		for(int i=0;i<temp.size();i++) {
			
			for(int j=0;j<temp.get(i).size();j++) {
				
				System.out.print(temp.get(i).get(j)+ " ");
			}
		 
			System.out.println();	
	 }	
		
	}// main
	
	
}// BFS1
