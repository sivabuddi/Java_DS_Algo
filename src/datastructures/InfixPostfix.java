package datastructures;
import java.util.Scanner;
import java.util.Stack;

public class InfixPostfix {

	private String input; 
	public InfixPostfix(String s) {
		input = s;
	}
	
	public int precedence(char ch) {
		
	switch(ch) {
	
	case '+':
	case '-':
			 return 1;
	
	case '*':
	case '/':
			 return 2;
	
	case '^':
			 return 3;
			 
	}
	return -1;	
	}
	
	public String checking() {
		
	String result = new String(" ");
	Stack<Character> s = new Stack<Character>();
	char ch;
	for(int i=0;i<input.length();i++) {
		ch = input.charAt(i);
		if(Character.isLetterOrDigit(ch)) {
			result += ch;			
		}//if
		
		else if(ch == '(') {
			s.push(ch);	
			
		} //else if
		
		else if(ch == ')') {
			while(!s.isEmpty() && s.peek()!='(')
				result += s.pop();
			
			 s.pop();
			
		}//else if
		
		else {
			
			while(!s.isEmpty() && precedence(ch)<=precedence(s.peek()))
			  result +=s.pop();
			
			s.push(ch);
		}//else				
	}
	
	   // pop all operators from stack
	
	    while(!s.isEmpty()) {	    	
	      if (s.peek() =='(') {
	    	  System.out.println("Error");
	      }//if
	      else {
			  result += s.pop();
		}//else
		
	 }//while

	return result;
	}

	public static void main(String[] args) {
	System.out.println("Enter the input string");	
	String string = new Scanner(System.in).nextLine();	
	InfixPostfix in = new InfixPostfix(string);
		      string = in.checking();
	System.out.println(string);
	
		
	}
	
	
}
