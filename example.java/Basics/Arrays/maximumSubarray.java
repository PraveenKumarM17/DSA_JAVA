package Arrays;

import java.util.Scanner;

public class maximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Using Kadane's Algorithm (O(n))
        int maximum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > maximum) {
                maximum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum = " + maximum);

        sc.close();
    }
}


/* ✅ Better Version (Handles all cases properly, including all-negative arrays)
for (int i = 0; i < arr.length; i++) {
    sum = Math.max(arr[i], sum + arr[i]);
    maximum = Math.max(maximum, sum);
}
*/

/* ❌ Brute Force Version (O(n^2))
for (int i = 0; i < arr.length; i++) {
    int sum = 0;
    for (int j = i; j < arr.length; j++) {
        sum += arr[j];
        maximum = Math.max(maximum, sum);
    }
}
*/

/* 📘 Notes on Kadane’s Algorithm:
--------------------------------------------------
1. Idea:
   - Keep adding array elements to a running sum.
   - If running sum becomes negative, reset it to 0 
     (because negative sum will not help future subarrays).
   - Keep track of the maximum sum seen so far.

2. Time Complexity:
   - Kadane’s Algorithm: O(n)
   - Brute Force: O(n^2)

3. Edge Case:
   - If all numbers are negative, the "better version" is preferred,
     because it correctly returns the largest negative number.

--------------------------------------------------
📌 Dry Run Example: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

Step i=0 → sum = -2 → reset to 0 → maximum = -2
Step i=1 → sum = 0+1 = 1 → maximum = 1
Step i=2 → sum = 1+(-3) = -2 → reset to 0 → maximum = 1
Step i=3 → sum = 0+4 = 4 → maximum = 4
Step i=4 → sum = 4+(-1) = 3 → maximum = 4
Step i=5 → sum = 3+2 = 5 → maximum = 5
Step i=6 → sum = 5+1 = 6 → maximum = 6
Step i=7 → sum = 6+(-5) = 1 → maximum = 6
Step i=8 → sum = 1+4 = 5 → maximum = 6

✅ Final Answer = 6  (subarray [4, -1, 2, 1])
--------------------------------------------------
*/
