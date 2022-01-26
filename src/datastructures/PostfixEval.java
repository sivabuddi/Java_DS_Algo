package datastructures;
import java.util.*;

 

public class PostfixEval {
	
	String input;
	
	public PostfixEval(String s) {
		input = s;
		
	}
	
	
	public int postfix_eval() {
		Stack<Integer> st = new Stack<>();
		int left_operand, right_operand;
		for(int i=0;i<input.length();i++) {
			
			if(Character.isDigit(input.charAt(i))) {
				
				st.push(input.charAt(i)-'0');				
			}
			else {
				right_operand = st.pop();
				left_operand = st.pop();
				
			switch(input.charAt(i)) {
			
			case '+':
					 st.push(left_operand+right_operand);
					 break;
			
			case '-':
					 st.push(left_operand-right_operand);
					 break;
			
			case '*':
					 st.push(left_operand * right_operand);
					 break;
			
			case '/':
					 st.push(left_operand / right_operand);
					 break;
			
			default:
			}
				
				
			}//else
			
			
		}//for
		
		return st.pop();
	}//postfix_eval

	
	
	public static void main(String[] args) {
		
		while(true){
		System.out.println("Enter the input string for postfix evaluation");
		String postfix_exp = getString();
		PostfixEval pe = new PostfixEval(postfix_exp);
		       int result=pe.postfix_eval();
		       System.out.println(result);
   
		       
			}
		       
		}
		       		       
		
	public static String getString() {
		
		return new Scanner(System.in).nextLine();
	}
	
		
}
