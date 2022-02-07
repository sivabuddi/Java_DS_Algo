package binarytrees;

class Nodes{
	
	int data;
	Nodes left, right;
	
	public Nodes(int data) {
		this.data = data;
		left = right = null;
	} // constructor
	
} // Nodes

public class Ceiling {

	
    public static Nodes insert(Nodes root, int element) {
    	
    	
    	if(root==null)
    		return new Nodes(element);
    	
    	if(element<root.data)
    		root.left = insert(root.left, element);
    	
    	if(element>root.data)
    		root.right = insert(root.right, element);
    	
    	return root;
    	
    }// insert
    
    public static int ceiling(Nodes root, int key) {
    	
    	 
    	
    	if(root==null)
    		return 0;
    	
    	
    	if(root.data == key)
    		return root.data;
    	
    	// move to right sub tree
    	if(key > root.data) {
    		return ceiling(root.right, key);	
    	}
    	
    	// move to left sub tree  		
    	int ceil = ceiling(root.left, key);
    		
    	   	
    	return ceil >= key?ceil:root.data;

    	
    }
    
    
 public static int flooring(Nodes root, int key) {
    	
    	 
    	
    	if(root==null)
    		return 0;
    	
    	
    	if(root.data == key)
    		return root.data;
    	
    	// move to left sub tree
    	if(key < root.data) {
    		return flooring(root.left, key);	
    	}
    	
    	// move to right sub tree  		
    	int floor = flooring(root.right, key);
    		
    	   	
    	return floor >= key?floor:root.data;

    	
    }
    
    
    
    public static void main(String[] args) {
		
    	Nodes root = null;
    	int keys[]= {20,10,30,5,15,25,40};
    	
    	for(int i:keys)
    		root =insert(root,i);
    	
    	
    
    	int ceil = ceiling(root,22);
        int floor = flooring(root,22);
        System.out.println(" Ceiling = "+ceil);
        System.out.println(" Flooring = "+floor);
    
    	
	}// main
	
	
}// Ceiling
