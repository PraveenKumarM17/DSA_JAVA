package Arrays;

import java.util.Scanner;

public class moveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Move all zeros to the end using a two-step approach
        int j = 0;

        // Step 1: Shift all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Step 2: Fill the remaining positions with zeros
        for (int i = j; i < n; i++) {
            arr[j++] = 0;
        }

        // Alternative method using Two Pointers within a single loop
        /* 
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        */

        System.out.println("The array after moving zeros to the end: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

/*
Notes:

1. Problem: Move all zeros in an array to the end while maintaining the order of non-zero elements.
2. Approach:
   - Step 1: Traverse the array and copy all non-zero elements to the front.
   - Step 2: Fill remaining positions with zeros.
   - Alternative: Use the two-pointer technique to swap in a single traversal.
3. Time Complexity: O(n)
4. Space Complexity: O(1)
5. Useful for learning array manipulation and the two-pointer technique.
*/


/*
Two-Pointer Approach Dry Run:

Input: arr = [0, 1, 0, 3, 12]

Step 0: Initialize j = 0

Loop through i from 0 to n-1:

i = 0:
arr[i] = 0 → skip, j = 0

i = 1:
arr[i] = 1 ≠ 0 → swap arr[i] and arr[j]
arr = [1, 0, 0, 3, 12]
j = 1

i = 2:
arr[i] = 0 → skip, j = 1

i = 3:
arr[i] = 3 ≠ 0 → swap arr[i] and arr[j]
arr = [1, 3, 0, 0, 12]
j = 2

i = 4:
arr[i] = 12 ≠ 0 → swap arr[i] and arr[j]
arr = [1, 3, 12, 0, 0]
j = 3

Result: [1, 3, 12, 0, 0]

Explanation:
- `j` always points to the next position where a non-zero element should go.
- Whenever a non-zero is found at i, we swap it with arr[j].
- This ensures all non-zero elements move to the front while zeros shift to the back.
- Done in a single pass (O(n)) with constant space (O(1)).
*/

