package binarytrees;

import java.util.HashMap;



class VerticalNode{
	
	int data;
	public VerticalNode left, right;
	
	public VerticalNode(int data) {
		
		this.data = data;
		left = null;
		right= null;
	}// constructor
	
}// VerticalNode

public class VerticalSum {
	
	public static void vSum(HashMap<Integer, Integer> hash, VerticalNode root,int key) {
	
		if(root.left!=null)
			vSum(hash, root.left, key-1);
		
		if(root.right!=null)
			vSum(hash, root.right, key+1);
		
		int data=0;
		
		if(hash.containsKey(key))
			data = hash.get(key);
		
		hash.put(key, root.data+data);
		
	}
	
	
	public static void verticalSum(VerticalNode root) {
	
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		vSum(map, root, 0);
		System.out.println();
		
		for(int k:map.keySet()) {
			System.out.println("Key(pos): "+k + "Sum: "+map.get(k));
		}//for
		
		
	}// vertialSum
		
	
	
	public static void main(String[] args) {
		
		VerticalNode root = new VerticalNode(1);
		root.left = new VerticalNode(2);
		root.right = new VerticalNode(3);
		root.left.left=new VerticalNode(4);
		root.left.right = new VerticalNode(5);
		root.right.left = new VerticalNode(6);
		root.right.right = new VerticalNode(7);
		verticalSum(root);
		
	}

}
