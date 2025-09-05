package Arrays;

import java.util.Scanner;

public class linearSearchReturnIndex {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int nums = sc.nextInt();

        int cnt = 0;
        System.out.println("The index/indices are: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == nums) {
                System.out.print(i+" ");
                cnt++;
            }
        }

        if (cnt == 0) {
            System.out.println("-1 (Element not found)");
        }

        sc.close();
    }
}



/*
Logic Explanation:

- Approach: Linear Search
- Data Structure: Array
- How it works:
    1. Loop through each element of the array.
    2. If an element matches the target, print its index.
    3. Use a counter to check if the element was found at least once.
    4. If the counter is 0 after the loop, print -1.
- Why this approach:
    - Simple and straightforward for small arrays.
    - Checks all elements one by one, ensuring all occurrences are found.
*/


/*
Time Complexity (TC):
- O(n), where n is the size of the array.
- Reason: We loop through each element once to check for the target.

Space Complexity (SC):
- O(1)
- Reason: No extra data structures are used; only a few variables (cnt, nums, i) are needed.
*/
