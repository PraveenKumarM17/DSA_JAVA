import java.util.Scanner;

public class MaxProfitStock {

    // Function to find maximum profit from a single buy/sell
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Track the minimum price seen so far
        int maxProfit = 0;                // Track the maximum profit

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;        // Update minimum price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Update max profit
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter the stock prices for each day:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Call function
        int result = maxProfit(prices);

        // Display result
        System.out.println("Maximum profit achievable: " + result);

        sc.close();
    }
}

/*
 * Program Notes:
 * 
 * Description:
 * Finds the maximum profit possible by buying and selling a stock once.
 * You must buy before you sell.
 * 
 * Algorithm Steps:
 * 1. Initialize minPrice = Integer.MAX_VALUE and maxProfit = 0.
 * 2. Traverse the array of prices:
 *    - If current price < minPrice, update minPrice.
 *    - Else, compute potential profit = current price - minPrice.
 *      Update maxProfit if potential profit is higher.
 * 3. Return maxProfit.
 * 
 * Dry Run Example:
 * Input: [7, 1, 5, 3, 6, 4]
 * Step 1: minPrice = 7, maxProfit = 0
 * Step 2: price=1 -> minPrice=1
 * Step 3: price=5 -> profit=5-1=4 -> maxProfit=4
 * Step 4: price=3 -> profit=3-1=2 -> maxProfit=4
 * Step 5: price=6 -> profit=6-1=5 -> maxProfit=5
 * Step 6: price=4 -> profit=4-1=3 -> maxProfit=5
 * Output: 5
 * 
 * Time Complexity: O(n) -> single pass through array
 * Space Complexity: O(1) -> only two variables used
 */
