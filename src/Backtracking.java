public class Backtracking {
	
	public static int max(int a, int b) {
		
		return a>b?a:b;
	}

	public static int knapsack(int profit[], int weight[],int target_weight, int n) {
		
		
		if (n == 0 || target_weight ==0)
				return 0;
		
		else if(weight[n-1]>target_weight)
			 return knapsack(profit, weight, target_weight, n-1);
				
		else {
			int temp1  = knapsack(profit, weight, target_weight, n-1);
			int temp2  = profit[n-1]+ knapsack(profit, weight, target_weight-weight[n-1],n-1);
			return max(temp1, temp2);
			
		}// else
		
		
	}// knapsack
	
	
	public static void main(String[] args) {
		
		int profit[] = {10,20,30};
		int weight[] = {2,3,5};
		int target_weight = 7;
		
		int result = knapsack(profit, weight, target_weight, profit.length);
		System.out.println(result);
		
	}// main
	

}// Backtracking
