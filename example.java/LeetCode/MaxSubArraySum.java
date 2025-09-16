import java.util.Scanner;

public class MaxSubArraySum {

    // Function to find maximum subarray sum using Kadane's Algorithm
    public static int maxSubArray(int[] nums) {
        int maximum = Integer.MIN_VALUE; // maximum sum found so far
        int sum = 0;                     // current subarray sum

        for (int num : nums) {
            sum += num;
            
            if (sum > maximum) {
                maximum = sum;
            }

            if (sum < 0) {
                sum = 0; // reset sum if negative
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call function
        int result = maxSubArray(nums);

        // Display result
        System.out.println("Maximum subarray sum: " + result);

        sc.close();
    }
}

/*
 * Program Notes:
 * 
 * Description:
 * Finds the contiguous subarray within a one-dimensional array which has the largest sum.
 * Uses Kadane's Algorithm for efficient O(n) solution.
 * 
 * Algorithm Steps (Kadane's):
 * 1. Initialize sum = 0 and maximum = Integer.MIN_VALUE.
 * 2. Traverse the array:
 *    - Add current element to sum.
 *    - Update maximum if sum > maximum.
 *    - If sum < 0, reset sum to 0.
 * 3. Return maximum sum.
 * 
 * Alternative Approaches (commented in original code):
 * - Prefix sum with max(sum, nums[i]) method (also O(n)).
 * - Brute-force nested loops summing all subarrays (O(n^2)).

 * Dry Run Example:
 * Input: [-2,1,-3,4,-1,2,1,-5,4]
 * Step-by-step:
 *   sum = -2 -> reset sum=0, maximum=-2
 *   sum = 1  -> maximum=1
 *   sum = -3+1=-2 -> reset sum=0
 *   sum = 4  -> maximum=4
 *   sum = 4-1=3 -> maximum=4
 *   sum = 3+2=5 -> maximum=5
 *   sum = 5+1=6 -> maximum=6
 *   sum = 6-5=1 -> maximum=6
 *   sum = 1+4=5 -> maximum=6
 * Output: 6
 * 
 * Time Complexity: O(n) -> single pass through array
 * Space Complexity: O(1) -> only variables used
 */
