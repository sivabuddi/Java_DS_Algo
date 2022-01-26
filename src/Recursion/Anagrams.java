package Recursion;

import java.util.Scanner;



public class Anagrams {
	
	public static int array_size;
	public static char [] char_array = new char[100];
	public static int count;
	
	public static void doAnagram(int newSize) {
		
		if(newSize ==1) {
			return;
		}
		
		for (int j=0;j<newSize;j++) {
			doAnagram(newSize-1);
			
			if(newSize==2)
				displayWord();
			rotate(newSize);
			
			
		}//for if size is more than 1
		
	}
	
	
	public static void rotate(int rotate_size) {	
		int i;
		int position =array_size-rotate_size;
		char temp = char_array[position];
		
		for (i=position+1;i<array_size;i++) {
			char_array[i-1]=char_array[i];
			char_array[i]= temp;
		}
		
	}//rotate
	

	public static void displayWord() {
		System.out.print(++count+ " :");
		for(int i=0;i<array_size;i++) {
			System.out.print(char_array[i]);
		}
		System.out.println();
	}//displayWord
	
	
	public static void main(String[] args) {	
	System.out.println("Enter the input string");
	String input_str = getString();
	
	count =0;
	array_size = input_str.length();

	
	for(int j=0;j<array_size;j++)
		char_array[j] = input_str.charAt(j);
	
	doAnagram(array_size);
	}//main
	
	
	public static String getString() {
	return new Scanner(System.in).nextLine();	
	}//getString
	

}
