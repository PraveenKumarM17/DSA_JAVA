import java.util.Scanner;

public class MinOperationsEqualArray {

    // Function to find minimum operations to make all elements equal
    public static int minOperations(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[0]) {
                return 1; // At least one operation needed
            }
        }
        return 0; // All elements are already equal
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
        int result = minOperations(nums);

        // Display result
        System.out.println("Minimum operations to make all elements equal: " + result);

        sc.close();
    }
}

/*
 * Program Notes:
 * 
 * Description:
 * Determines the minimum number of operations to make all elements in an array equal.
 * According to the problem, a single operation can make all elements equal to any value.
 * 
 * Algorithm Steps:
 * 1. Traverse the array from the second element to the end.
 * 2. Compare each element with the first element:
 *    - If any element is different, return 1 (at least one operation needed).
 * 3. If all elements are the same, return 0.
 * 
 * Dry Run Example:
 * Input: [2, 2, 2, 3]
 * Step 1: nums[1]=2 == nums[0]=2 -> continue
 * Step 2: nums[2]=2 == nums[0]=2 -> continue
 * Step 3: nums[3]=3 != nums[0]=2 -> return 1
 * Output: 1
 * 
 * Time Complexity: O(n) -> single pass through array
 * Space Complexity: O(1) -> only variables used
 */
