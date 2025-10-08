package Arrays.Medium;

import java.util.Scanner;

public class NextPermutation {

    // Utility function to swap two elements
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Utility function to reverse part of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = -1;

        // Step 1: Find the first decreasing element from the right
        // This is where the next permutation needs to be generated
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 2: If no such index found → array is in descending order
        // Hence, we just reverse it to get the smallest permutation
        if (index == -1) {
            reverse(arr, 0, n - 1);
        } else {
            // Step 3: Find the next greater element than arr[index] from the right
            for (int i = n - 1; i > index; i--) {
                if (arr[i] > arr[index]) {
                    swap(arr, i, index);
                    break;
                }
            }

            // Step 4: Reverse the part after the index
            // Because we want the smallest order after swapping
            reverse(arr, index + 1, n - 1);
        }

        // Output the next permutation
        System.out.print("Next permutation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}


/*
---------------------------------------------------------------
🧠 EXPLANATION & NOTES
---------------------------------------------------------------

🔹 Problem:
Given an array representing numbers, rearrange it into the **next lexicographical permutation**.
If it’s already the largest permutation, rearrange it to the smallest one.

Example:
Input:  [1, 2, 3]
Output: [1, 3, 2]

Input:  [3, 2, 1]
Output: [1, 2, 3]

---------------------------------------------------------------
💡 ALGORITHM:
---------------------------------------------------------------
1️⃣ **Find the first decreasing index (from right to left)**
   - Traverse from the second-last element backwards.
   - Find the first pair where arr[i] < arr[i+1].
   - Example: For [1, 2, 3, 6, 5, 4, 2], index = 2 (value 3)

2️⃣ **If no index found**
   - The array is sorted in descending order → last permutation.
   - So reverse the entire array → first permutation (ascending order).

3️⃣ **Find the next greater element on the right**
   - Traverse from the right end.
   - Find the smallest number greater than arr[index].
   - Swap both numbers.

4️⃣ **Reverse the part after index**
   - To get the smallest sequence after the swapped number.

---------------------------------------------------------------
🧮 DRY RUN EXAMPLE:
---------------------------------------------------------------
Input: [1, 2, 3]

Step 1: Find first decreasing from right:
   2 < 3 → index = 1

Step 2: Find next greater element to the right of 2:
   → 3 > 2 → swap(1, 2)

Array → [1, 3, 2]

Step 3: Reverse after index 1:
   Only [2], so no change.

✅ Output: [1, 3, 2]

---------------------------------------------------------------
Another Example:
Input: [3, 2, 1]

Step 1: No decreasing element → index = -1
Step 2: Reverse entire array → [1, 2, 3]
✅ Output: [1, 2, 3]

---------------------------------------------------------------
⏱️ COMPLEXITY ANALYSIS:
---------------------------------------------------------------
Time Complexity:
  - Finding index: O(n)
  - Finding next greater: O(n)
  - Reversing part: O(n)
  ✅ Total → O(n)

Space Complexity:
  - Only a few variables used → O(1)

---------------------------------------------------------------
📘 SUMMARY:
---------------------------------------------------------------
✅ Find first decreasing element (from right)
✅ Find next greater element to swap
✅ Reverse the remaining part
✅ Works in O(n) time, O(1) space

---------------------------------------------------------------
*/