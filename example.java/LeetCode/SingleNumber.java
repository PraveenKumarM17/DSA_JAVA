import java.util.Scanner;

public class SingleNumber {

    // Function to find the single number in an array where every other number appears twice
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR all numbers
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
        int result = singleNumber(nums);

        // Display result
        System.out.println("The single number in the array is: " + result);

        sc.close();
    }
}

/*
 * Program Notes:
 * 
 * Description:
 * Finds the element that appears only once in an array where every other element appears exactly twice.
 * Uses XOR properties: a ^ a = 0, a ^ 0 = a, and XOR is commutative.
 * 
 * Algorithm Steps:
 * 1. Initialize result = 0.
 * 2. Traverse the array:
 *    - XOR each element with result.
 * 3. Return result.
 * 
 * Dry Run Example:
 * Input: [4, 1, 2, 1, 2]
 * Step 1: result = 0 ^ 4 = 4
 * Step 2: result = 4 ^ 1 = 5
 * Step 3: result = 5 ^ 2 = 7
 * Step 4: result = 7 ^ 1 = 6
 * Step 5: result = 6 ^ 2 = 4
 * Output: 4
 * 
 * Time Complexity: O(n) -> single pass through array
 * Space Complexity: O(1) -> no extra space needed
 */
