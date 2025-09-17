import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayBySign {

    // Function to rearrange array with positives at even indices and negatives at odd indices
    public static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];

        int posIndex = 0; // Start placing positives at index 0
        int negIndex = 1; // Start placing negatives at index 1

        for (int num : nums) {
            if (num >= 0) {
                ans[posIndex] = num;
                posIndex += 2;
            } else {
                ans[negIndex] = num;
                negIndex += 2;
            }
        }

        return ans;
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
        int[] result = rearrangeArray(nums);

        // Display result
        System.out.println("Rearranged array with alternate positive and negative numbers:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}

/*
 * Program Notes:
 * 
 * Description:
 * Rearranges an array so that positive and negative numbers are placed alternately.
 * Positives are placed at even indices (0,2,4...) and negatives at odd indices (1,3,5...).
 * Assumes the number of positive and negative elements are equal or differ by at most 1.
 * 
 * Algorithm Steps:
 * 1. Create an empty result array of the same length.
 * 2. Initialize posIndex = 0 and negIndex = 1.
 * 3. Traverse the original array:
 *    - If the element is positive, place it at posIndex and increment posIndex by 2.
 *    - If the element is negative, place it at negIndex and increment negIndex by 2.
 * 4. Return the result array.
 * 
 * Dry Run Example:
 * Input: [3, 1, -2, -5, 2, -4]
 * Positives: 3, 1, 2 -> placed at indices 0,2,4
 * Negatives: -2, -5, -4 -> placed at indices 1,3,5
 * Output: [3, -2, 1, -5, 2, -4]
 * 
 * Time Complexity: O(n) -> single pass through array
 * Space Complexity: O(n) -> result array
 */
