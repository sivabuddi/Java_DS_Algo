package trees;

public class BinaryTree { 
    static class Node {    
    int value; 
        Node left, right; 
          
        Node(int value){ 
            this.value = value; 
            left = null; 
            right = null; 
        } 
    } 
       
    public void insert(Node node, int value) {
        if (value < node.value) { 
        	if (node.left != null) { 
        		insert(node.left, value); 
        		}
        	else { 
        		// System.out.println(" Inserted " + value + " to left of " + node.value); 
        		node.left = new Node(value); 
        		} 
        	}//if 
        	else if (value > node.value) {
          if (node.right != null) {
            insert(node.right, value);
          } else {
        	  
            //System.out.println("  Inserted " + value + " to right of "+ node.value);
            node.right = new Node(value);
          }//else
          
        }//else if
        
      }//insert
    
     public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            // System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
        
     }//traverseInOrder
     
     public static void main(String args[]) { 
    BinaryTree tree = new BinaryTree();
                Node root = new Node(5);
                System.out.println("Binary BinaryTree Example");
                System.out.println("Building tree with root value " + root.value);
                tree.insert(root, 2);
                tree.insert(root, 4);
                tree.insert(root, 8);
                tree.insert(root, 6);
                tree.insert(root, 7);
                tree.insert(root, 3);
                tree.insert(root, 9);
                System.out.println("Traversing tree in order");
                tree.traverseInOrder(root);
                
              }// main
     
}//BinaryTree