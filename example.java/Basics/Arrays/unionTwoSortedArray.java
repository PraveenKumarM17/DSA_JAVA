package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class unionTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array1 size: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the array1 size: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> res = new HashSet<>();

        for (Integer cpy : arr1) {
            res.add(cpy);
        }
        for (Integer cpy : arr2) {
            res.add(cpy);
        }

        for (Integer op : res) {
            System.out.print(op+" ");
        }

        sc.close();
    }
}


/*
    Logic Notes: Union of Two Arrays

    Goal:
    Combine two arrays and keep only unique elements.

    Approach 1: Using HashSet (Current Approach)
    - Create a HashSet to store elements.
    - Add all elements from both arrays to the set.
    - Print elements of the set.
    - Pros: Simple, removes duplicates automatically.
    - Cons: Does not preserve order.
    - Time Complexity: O(n1 + n2) average
    - Space Complexity: O(n1 + n2)

    Approach 2: Using TreeSet (Sorted Union)
    - Use a TreeSet instead of HashSet.
    - Add all elements from both arrays.
    - Print elements — output will be sorted.
    - Pros: Sorted result, removes duplicates.
    - Cons: Slower than HashSet (O(log n) per insertion).
    - Time Complexity: O((n1 + n2) log(n1 + n2))

    Approach 3: Two-Pointer Technique (For Sorted Arrays)
    - Keep two pointers i and j at the start of the arrays.
    - Compare elements:
        * Add smaller element to result if it’s not already added.
        * Move pointers accordingly.
        * If elements are equal, add once and move both pointers.
    - Append remaining elements from either array.
    - Pros: Maintains sorted order, no extra set needed.
    - Time Complexity: O(n1 + n2)
    - Space Complexity: O(n1 + n2) (for result array only)

    Summary:
    - Use HashSet for simple union with no order guarantee.
    - Use TreeSet for sorted union.
    - Use Two-Pointer if arrays are already sorted and you want optimal time with order preserved.
*/
