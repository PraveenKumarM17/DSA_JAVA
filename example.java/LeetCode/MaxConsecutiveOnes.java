import java.util.Scanner;

public class MaxConsecutiveOnes {

    // Function to find the maximum number of consecutive 1s in a binary array
    public static int findMaxConsecutiveOnes(int[] arr) {
        int max = 0, count = 0;

        for (int num : arr) {
            if (num == 1) {
                count++; // increment count of consecutive ones
            } else {
                max = Math.max(max, count); // update max if a 0 is encountered
                count = 0; // reset count
            }
        }

        // Check at the end in case the array ends with 1
        max = Math.max(count, max);
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (0s and 1s):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call function
        int result = findMaxConsecutiveOnes(arr);

        // Display result
        System.out.println("Maximum number of consecutive 1s: " + result);

        sc.close();
    }
}

/*
 * Program Notes:
 * 
 * Description:
 * Finds the maximum number of consecutive 1s in a binary array.
 * 
 * Algorithm Steps:
 * 1. Initialize max = 0 and count = 0.
 * 2. Traverse the array:
 *    - If element is 1, increment count.
 *    - If element is 0, update max with count and reset count to 0.
 * 3. After traversal, update max in case the array ends with 1s.
 * 4. Return max.
 * 
 * Dry Run Example:
 * Input: [1,1,0,1,1,1]
 * Step-by-step:
 *   count=1 (1), count=2 (1), 0 encountered -> max=2, count=0
 *   count=1 (1), count=2 (1), count=3 (1) -> end of array -> max=3
 * Output: 3
 * 
 * Time Complexity: O(n) -> single pass through array
 * Space Complexity: O(1) -> only two variables used
 */
