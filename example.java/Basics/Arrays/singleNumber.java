package Arrays;

import java.util.Scanner;

public class singleNumber {
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

        // Find the single number
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }

        System.out.println("The single number is: " + result);

        sc.close();
    }
}

/**
 * Algorithm: Single Number
 *
 * Problem:
 * Given a non-empty array of integers where every element appears twice except for one,
 * find that single one.
 *
 * Steps:
 * 1. Initialize a variable 'result' to 0.
 * 2. Traverse the array:
 *      - For each element, perform XOR with 'result': result ^= num
 * 3. After the loop, 'result' will hold the single number because:
 *      - a ^ a = 0 (any number XOR itself is 0)
 *      - 0 ^ b = b  (0 XOR any number is that number)
 *
 * Dry Run Example:
 * Input: nums = [4, 1, 2, 1, 2]
 *
 * Step | Element | result | Action
 * ---------------------------------
 * 0    | 4       | 0 ^ 4 = 4 | XOR result with 4
 * 1    | 1       | 4 ^ 1 = 5 | XOR result with 1
 * 2    | 2       | 5 ^ 2 = 7 | XOR result with 2
 * 3    | 1       | 7 ^ 1 = 6 | XOR result with 1
 * 4    | 2       | 6 ^ 2 = 4 | XOR result with 2
 *
 * Output: 4 (the single number)
 */
