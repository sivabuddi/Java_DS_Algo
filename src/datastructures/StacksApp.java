package datastructures;

import java.util.Scanner;

public class StacksApp{
	private int max_size;
	private int[] arr;
	private int top;
	
	public StacksApp(int n) {
		max_size=n;
		arr = new int[max_size];
		top=-1;
	}		
	public void display() {
		System.out.println("Stack elements =\n");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}	
	public void push(int n) {
			arr[++top]= n;

		}
	public int  pop() {
		return arr[top--];
	}
	
	public boolean isEmpty() {
		return (top ==-1);
	}
	
	public boolean isFull() {
		return (top==max_size-1);
	}
	
	public static void main(String[] args) {
    System.out.println("Enter the no.of.elements you want to push on the stack");
    int n = new Scanner(System.in).nextInt();
	StacksApp stacks = new StacksApp(n);
	while(!stacks.isFull()) {
		int element = new Scanner(System.in).nextInt();
		stacks.push(element);
		System.out.println(element+" is pushed on the top of the stack");
	}
	
	System.out.println("After pushing the elements on the top of the stack\n");
		for (int i = 0; i <stacks.max_size; i++) {
		System.out.println(stacks.arr[i]);
	}
	
	while(!stacks.isEmpty()) {
		int pop_element = stacks.pop();
		System.out.println("Elements poped from the stack are"+pop_element);
	}
	
	System.out.println("After popping the elements on the top of the stack\n");
	for (int i = 0; i <stacks.max_size; i++) {
	System.out.println(stacks.arr[i]);
	}

  }
}
