import java.util.Scanner;

public class MissingNumber {

    // Function to find the missing number in an array containing 0 to n
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = (n * (n + 1)) / 2; // sum of 0..n
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array (numbers from 0 to n, one missing):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call function
        int result = missingNumber(nums);

        // Display result
        System.out.println("The missing number is: " + result);

        sc.close();
    }
}

/*
 * Program Notes:
 * 
 * Description:
 * Finds the missing number in an array containing n distinct numbers taken from 0,1,...,n.
 * 
 * Algorithm Steps:
 * 1. Calculate the expected sum of numbers from 0 to n using formula sum = n*(n+1)/2.
 * 2. Calculate the actual sum of numbers in the array.
 * 3. The missing number is the difference: expectedSum - actualSum.
 * 
 * Dry Run Example:
 * Input: [3, 0, 1]
 * n = 3
 * expectedSum = 3*4/2 = 6
 * actualSum = 3+0+1 = 4
 * missingNumber = 6-4 = 2
 * Output: 2
 * 
 * Time Complexity: O(n) -> single pass through array
 * Space Complexity: O(1) -> only variables used
 */
