package datastructures;

public class ReverseString {

	private char[] arr;
	private int max_size;
	private int top;
	
	public ReverseString(int n) {
		max_size= n;
		arr = new char[max_size];
		top=-1;
	}
	
	public void push(String s) {
		//String element = new java.util.Scanner(System.in).next();
		for (int i = 0; i <max_size; i++) {
		arr[++top]=s.charAt(i);	
		}
	}
	
	public void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public char pop() {
		return arr[top--];
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter the name of the string that you want to reverse\n");
		String s = new java.util.Scanner(System.in).nextLine();
		int s_length = s.length();
		ReverseString string_reverse = new ReverseString(s_length);
 		string_reverse.push(s);
 		string_reverse.display();
 		System.out.println();
 		char ch;
 		while(!string_reverse.isEmpty()) {
 			ch = string_reverse.pop();
 			System.out.print(ch);
 		}
		
	}
	
}
