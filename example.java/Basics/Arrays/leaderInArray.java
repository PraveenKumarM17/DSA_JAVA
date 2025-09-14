package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class leaderInArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> temp = new ArrayList<>();


        // Optimized approach
        int max = arr[n-1];

        temp.add(max);

        for (int i = n-2; i >= 0; i--) {
            if (arr[i] > max) {
                temp.add(arr[i]);
                max = arr[i];
            }
        }


        // Brute force
        /* for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i; j < n; j++) {
              if (arr[i] < arr[j]) {
                isLeader = false;
                break;
              }
            }
            if (isLeader) {
                temp.add(arr[i]);
            }
        } */

        System.out.println("The leader array is "+temp);

        sc.close();
    }
}


/*
========================================
📌 Notes on Leader in Array Problem
========================================

🔹 Problem Definition:
A leader in an array is an element that is strictly greater than all the elements to its right.

🔹 Example:
Input  : [16, 17, 4, 3, 5, 2]
Output : [17, 5, 2]
Explanation: 
- 17 is greater than all elements to its right.
- 5 is greater than 2 (to its right).
- 2 is always a leader since it’s the last element.

----------------------------------------
🔹 Approaches:
1. Brute Force (O(n^2)):
   - For each element, check if it is greater than all elements to its right.
   - If yes, mark it as a leader.

2. Optimized Approach (O(n)):
   - Start from the rightmost element (which is always a leader).
   - Keep track of the maximum seen so far.
   - If the current element is greater than this maximum, mark it as a leader.
   - This reduces time complexity from O(n^2) to O(n).

----------------------------------------
🔹 Space Complexity:
- O(1) extra space (excluding the result storage).

🔹 Time Complexity:
- Brute Force : O(n^2)
- Optimized   : O(n)

----------------------------------------
🔹 Key Learning:
- Reverse traversal is a powerful technique to optimize problems
  where conditions depend on "elements to the right".
========================================
*/
