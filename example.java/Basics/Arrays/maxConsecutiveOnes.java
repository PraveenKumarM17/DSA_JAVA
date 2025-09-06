package Arrays;

import java.util.Scanner;

public class maxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Take array elements
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Find max consecutive ones
        int max = 0, count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        max = Math.max(max, count); // Check at the end in case the last elements are 1s

        System.out.println("Maximum consecutive ones: " + max);

        sc.close();
    }
}


/**
 * Algorithm: Maximum Consecutive Ones
 *
 * Problem:
 * Find the maximum number of consecutive 1's in a binary array.
 *
 * Steps:
 * 1. Initialize two variables:
 *      - count = 0 : to count the current sequence of 1's
 *      - max = 0   : to store the maximum consecutive 1's found so far
 * 2. Traverse the array:
 *      - If the element is 1, increment count
 *      - If the element is 0, update max = Math.max(max, count) and reset count = 0
 * 3. After the loop, update max one last time: max = Math.max(max, count)
 * 4. Print max as the result
 *
 * Dry Run Example:
 * Input: nums = [1, 1, 0, 1, 1, 1, 0, 1]
 *
 * Step | Element | count | max | Action
 * ----------------------------------------
 * 1    | 1       | 1     | 0   | Increment count
 * 2    | 1       | 2     | 0   | Increment count
 * 3    | 0       | 0     | 2   | Update max, reset count
 * 4    | 1       | 1     | 2   | Increment count
 * 5    | 1       | 2     | 2   | Increment count
 * 6    | 1       | 3     | 2   | Increment count
 * 7    | 0       | 0     | 3   | Update max, reset count
 * 8    | 1       | 1     | 3   | Increment count
 *
 * After loop: max = Math.max(max, count) = 3
 * Output: Maximum consecutive ones = 3
 */

