package Arrays;

import java.util.Scanner;

public class longestSubArry {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Take array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Input the sum k : ");
        int k = sc.nextInt();

        int maxLen = 0;

        // Brute force O(n^2)
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        System.out.println("The length of the longest sub array is : " + maxLen);
        sc.close();
    }
}



/**
 * Algorithm Explanation:
 * ----------------------
 * Problem: Find the length of the longest subarray whose sum is exactly equal to k.
 *
 * Approach: Brute Force (O(n^2))
 * --------------------------------
 * 1. Input the size of the array and its elements.
 * 2. Take the target sum 'k'.
 * 3. Initialize maxLen = 0 to keep track of the longest valid subarray length.
 * 4. Use two nested loops:
 *      - Outer loop (i): starting index of subarray.
 *      - Inner loop (j): ending index of subarray.
 * 5. For each (i, j) pair:
 *      - Maintain a running sum by adding arr[j].
 *      - If sum == k, update maxLen = max(maxLen, j - i + 1).
 * 6. After checking all subarrays, print maxLen.
 *
 * Time Complexity:
 * ----------------
 * - Outer loop runs n times.
 * - Inner loop runs up to n times for each i.
 * - Total complexity: O(n^2).
 *
 * Space Complexity:
 * -----------------
 * - Only a few integer variables used → O(1) extra space.
 *
 * Limitations:
 * ------------
 * - Works fine for small/medium arrays.
 * - For very large arrays (n > 10^5), this brute force method will be too slow.
 *   (Optimized O(n) solution exists using HashMap + prefix sum).
 *
 *
 * Dry Run Example:
 * ----------------
 * Input:
 *   n = 5
 *   arr = [1, 2, 3, 1, 1]
 *   k = 5
 *
 * Execution:
 *   i = 0: sum = 0
 *       j = 0 → sum = 1 (not equal)
 *       j = 1 → sum = 3 (not equal)
 *       j = 2 → sum = 6 (not equal)
 *       j = 3 → sum = 7 (not equal)
 *       j = 4 → sum = 8 (not equal)
 *
 *   i = 1: sum = 0
 *       j = 1 → sum = 2 (not equal)
 *       j = 2 → sum = 5 (equal → maxLen = 2, subarray [2,3])
 *
 *   i = 2: sum = 0
 *       j = 2 → sum = 3 (not equal)
 *       j = 3 → sum = 4 (not equal)
 *       j = 4 → sum = 5 (equal → maxLen = 3, subarray [3,1,1])
 *
 *   i = 3: sum = 0
 *       j = 3 → sum = 1 (not equal)
 *       j = 4 → sum = 2 (not equal)
 *
 *   i = 4: sum = 0
 *       j = 4 → sum = 1 (not equal)
 *
 * Output:
 *   The length of the longest sub array is : 3
 *
 * Explanation:
 *   The longest subarray with sum 5 is [3, 1, 1], length = 3.
 */
