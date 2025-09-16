import java.util.Scanner;

public class MaxXorSubsequences {

    // Function to find maximum XOR of any subsequence
    public static int maxXorSubsequences(int[] nums) {
        int[] basis = new int[32]; // linear basis for 32-bit integers

        // Build the XOR basis
        for (int num : nums) {
            for (int i = 31; i >= 0; i--) {
                if (((num >> i) & 1) == 0) continue; // skip if bit i is 0
                if (basis[i] == 0) { // if no basis vector yet
                    basis[i] = num;
                    break;
                }
                num ^= basis[i]; // reduce the number using the basis
            }
        }

        // Calculate maximum XOR from the basis
        int result = 0;
        for (int i = 31; i >= 0; i--) {
            result = Math.max(result, result ^ basis[i]);
        }
        return result;
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
        int result = maxXorSubsequences(nums);

        // Display result
        System.out.println("Maximum XOR of any subsequence: " + result);

        sc.close();
    }
}

/*
 * Program Notes:
 * 
 * Description:
 * Finds the maximum XOR value obtainable from any subsequence of a given integer array.
 * Uses the linear XOR basis method for efficiency.
 * 
 * Algorithm Steps:
 * 1. Initialize a basis array of size 32 (for 32-bit integers).
 * 2. For each number in the array:
 *    - Try to insert it into the basis:
 *       - Check each bit from 31 to 0.
 *       - If the bit is set and no basis vector exists at that bit, insert it.
 *       - Otherwise, reduce the number by XOR-ing with existing basis vectors.
 * 3. After building the basis, calculate the maximum XOR:
 *    - Start with result = 0.
 *    - For each basis vector from highest to lowest bit, XOR it with result if it increases the value.
 * 4. Return the final result.
 * 
 * Dry Run Example:
 * Input: [3, 10, 5]
 * Basis construction:
 *   Insert 3 -> basis[1] = 3
 *   Insert 10 -> basis[3] = 10
 *   Insert 5 -> basis[2] = 5
 * Maximum XOR computation:
 *   result = 0 -> XOR with basis[3]=10 -> result=10
 *   XOR with basis[2]=5 -> result=15
 *   XOR with basis[1]=3 -> result remains 15
 * Output: 15
 * 
 * Time Complexity:
 * - Basis construction: O(n * 32) = O(n)
 * - Maximum XOR computation: O(32) = O(1)
 * - Overall: O(n)
 * 
 * Space Complexity: O(32) = O(1) (fixed-size basis array)
 */
