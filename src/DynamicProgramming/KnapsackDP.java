package DynamicProgramming;

class KnapsackDP {
	 
    // A utility function that returns
    // maximum of two integers
    static int max(int a, int b)
    {
          return (a > b) ? a : b;
    }
 
    // Returns the maximum profitue that can
    // be put in a knapsack of capacity target_weight
    static int knapSack(int target_weight, int weight[],
                        int profit[], int n)
    {
        int i, w;
        int K[][] = new int[n + 1][target_weight + 1];
 
        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++)
        {
            for (w = 0; w <= target_weight; w++)
            {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (weight[i - 1] <= w)
                    K[i][w]
                        = max(profit[i - 1]
                         + K[i - 1][w - weight[i - 1]],
                         K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
 
        return K[n][target_weight];
    }
 
    // Driver code
    public static void main(String args[])
    {
        int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int target_weight = 50;
        int n = profit.length;
        System.out.println(knapSack(target_weight, weight, profit, n));
    }
}


