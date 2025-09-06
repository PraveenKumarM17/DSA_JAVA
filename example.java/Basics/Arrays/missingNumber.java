package Arrays;

import java.util.*;

public class missingNumber {
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

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find min and max
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Expected sum from min..max
        int expectedSum = (max * (max + 1)) / 2 - ((min - 1) * min) / 2;

        // Actual sum
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        // Missing number
        int missing = expectedSum - actualSum;
        System.out.println("Missing number is: " + missing);

        sc.close();
    }
}




/*
📌 Missing Number in a Range (General Case)

🔹 Problem:
Given an unsorted array of integers, one number is missing in the continuous range 
between the minimum and maximum element. The task is to find that missing number.

✅ Example:
Input:  [3, 4, 6, 7, 8]
Range:  3..8 → {3,4,5,6,7,8}
Expected Sum = 33
Actual Sum   = 28
Missing Number = 33 - 28 = 5

🔹 Approach:
1. Find the minimum and maximum elements in the array.
   - Use Math.min() and Math.max().
   - Start with Integer.MAX_VALUE for min and Integer.MIN_VALUE for max.

2. Calculate the expected sum of numbers from min → max using formula:
      sum(min..max) = (max*(max+1))/2 – ((min-1)*min)/2
   - Formula (n*(n+1))/2 gives sum from 1..n.
   - Subtract 1..(min-1) to get sum from min..max.

3. Calculate the actual sum of the array elements by looping through it.

4. The difference between expected sum and actual sum = missing number.

🔹 Time Complexity: O(n) 
   - One loop for finding min & max
   - One loop for calculating actual sum

🔹 Space Complexity: O(1) 
   - No extra space used apart from variables.

✅ This code works when exactly one number is missing in the sequence.
❌ If multiple numbers are missing, this formula-based approach will not work.
   (For multiple missing, we need to use HashSet-based checking.)

*/
