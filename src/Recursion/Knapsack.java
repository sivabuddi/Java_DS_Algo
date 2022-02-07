package Recursion;

public class Knapsack {
	
	public static int max(int a, int b) {
		return (a>b)?a:b;
	}
	
public static void knapsack_solver(int profit[], int weight[], int target_weight) {
	int result1=0,result2=0,max_3=0, max_2=0, max_1=0;
		
		// of length 3
		for(int i=0;i<profit.length-2;i++) {
		
		if (weight[i]+weight[i+1]+weight[i+2]<=target_weight) {
			max_3 =profit[i]+profit[i+1]+profit[i+2]; 
		}
		
				
	}// for loop
	
		
		// of length 2
		for(int i=0;i<profit.length-1;i++) {	
			if (weight[i]+weight[i+1]<=target_weight) {
			result1 =profit[i]+profit[i+1]; 
		}
			max_2= max(result1, max_2);		
	}// for loop
	
		
		// of length 1
		for(int i=0;i<profit.length;i++) {
			if(weight[i]<=target_weight) {
				result1 =weight[i];
			}
			max_1 = max(result1,max_1);
			
		}// for loop
		
		
		max_1 = max(max_1,max_2);
		max_1 = max(max_1, max_3);
		
		System.out.println("optimal solution for knapsack problem =" + max_1);
	
	
}// knapsack_solver

public static void main(String[] args) {
	int [] profit = {10,20,30};
	int [] weight = {1,1,1};
	int target_weight = 2;
	
	knapsack_solver(profit,weight,target_weight);
	
}// main

}//Knapsack
