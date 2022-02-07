package trees;
import java.util.Stack;
import java.util.ArrayList;


class Node4{
		
		int data;
		
		Node4 left, right;
		
		public Node4(int data) {
			this.data = data;
			left = right;
			
		}// constructor
			
		
}// Node4






public class Binary_postorder_Interative {
	
	
	   Node4 root;
	    ArrayList<Integer> list = new ArrayList<Integer>();
	 
	    // An iterative function to do postorder traversal
	    // of a given binary tree
	    ArrayList<Integer> postOrderIterative(Node4 node)
	    {
	        Stack<Node4> S = new Stack<Node4>();
	         
	        // Check for empty tree
	        if (node == null)
	            return list;
	        S.push(node);
	        Node4 prev = null;
	        while (!S.isEmpty())
	        {
	            Node4 current = S.peek();
	 
	            /* go down the tree in search of a leaf an if so process it
	            and pop stack otherwise move down */
	            if (prev == null || prev.left == current ||
	                                        prev.right == current)
	            {
	                if (current.left != null)
	                    S.push(current.left);
	                else if (current.right != null)
	                    S.push(current.right);
	                else
	                {
	                    S.pop();
	                    list.add(current.data);
	                }
	 
	                /* go up the tree from left node, if the child is right
	                push it onto stack otherwise process parent and pop
	                stack */
	            }
	            else if (current.left == prev)
	            {
	                if (current.right != null)
	                    S.push(current.right);
	                else
	                {
	                    S.pop();
	                    list.add(current.data);
	                }
	                 
	                /* go up the tree from right node and after coming back
	                from right node process parent and pop stack */
	            }
	            else if (current.right == prev)
	            {
	                S.pop();
	                list.add(current.data);
	            }
	 
	            prev = current;
	        }
	 
	        return list;
	    }

		
		
		

	
	
	public static void main(String[] args) {
		
		Binary_postorder_Interative tree = new Binary_postorder_Interative();
		 
        // Let us create trees shown in above diagram
        tree.root = new Node4(1);
        tree.root.left = new Node4(2);
        tree.root.right = new Node4(3);
        tree.root.left.left = new Node4(4);
        tree.root.left.right = new Node4(5);
        tree.root.right.left = new Node4(6);
        tree.root.right.right = new Node4(7);
 
        ArrayList<Integer> mylist = tree.postOrderIterative(tree.root);       
        System.out.println("Post order traversal of binary tree is :");
        System.out.println(mylist);
    }
		
	}// main
	
	


