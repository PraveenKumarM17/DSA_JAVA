package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int[] rearranged = sol.rearrangeArray(nums);

        System.out.println("Rearranged Array : " + Arrays.toString(rearranged));

        sc.close();
    }
}

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];

        int negIndx = 1; // odd indices for negative numbers
        int posIndx = 0; // even indices for positive numbers

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                ans[negIndx] = nums[i];
                negIndx += 2;
            } else {
                ans[posIndx] = nums[i];
                posIndx += 2;
            }
        }
        return ans;
    }
}

/*
------------------- NOTES -------------------

Problem:
Rearrange the array so that:
- Positive numbers are placed at even indices (0, 2, 4, ...).
- Negative numbers are placed at odd indices (1, 3, 5, ...).

Algorithm:
1. Create a result array 'ans' of the same size.
2. Maintain two pointers:
   - posIndx = 0 (for positives).
   - negIndx = 1 (for negatives).
3. Traverse through nums:
   - If number is positive -> put it at ans[posIndx] and increment posIndx by 2.
   - If number is negative -> put it at ans[negIndx] and increment negIndx by 2.
4. Return the rearranged array.

Time Complexity:
- O(n), we traverse the array once.

Space Complexity:
- O(n), we use an extra array of the same size.

Example:
Input:  [3, -2, 1, -5, 2, -4]
Output: [3, -2, 1, -5, 2, -4]  (positives at even, negatives at odd)

*/
