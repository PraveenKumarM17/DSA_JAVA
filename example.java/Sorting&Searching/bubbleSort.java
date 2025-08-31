
/* 📒 Notes on Bubble Sort 👇 */

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting the array using the bubbleSorting
        // Check if the previous number is greater than the next number, if 'Yes' swap

        for (int i = 0; i < n; i++){
            // didSwap is to break the loop if all elements are swapped
            int didSwap = 0;
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didSwap++;
                    // System.out.println("Swapped"+j);
                }
            }
            // Check after one full loop of 'i'
            if (didSwap == 0) {
                break;
            }
        }

        System.out.println("The array after sorting : ");
        for ( int nums : arr) {
            System.out.print(nums+" ");
        }


        sc.close();

    }
}



/* Notes */

// Bubble Sort is a simple comparison-based sorting algorithm.
// It repeatedly swaps adjacent elements if they are in the wrong order, until the array becomes sorted.
// Easy to implement and understand.
// Useful for very small datasets or when the list is already (almost) sorted.
// Rarely used in production due to inefficiency.


/* Variants of Bubble Sort */

// Standard Bubble Sort – compares and swaps adjacent elements.
// Optimized Bubble Sort – stops early if no swaps occur in a pass (best case O(n)).
// Recursive Bubble Sort – implemented using recursion.
// => Optimized when input may be nearly sorted.
// => Recursive mainly for academic learning.


/* Operations */

// 1. Compare two adjacent elements.
// 2. Swap if they are in the wrong order.
// 3. Repeat passes until sorted.


/* Time & Space Complexity */

// => Best Case (Already Sorted): O(n)
// => Average Case: O(n²)
// => Worst Case (Reverse Sorted): O(n²)
// => Space Complexity: O(1) (in-place)


/* Edge Cases */

// Already sorted array → should stop early.
// Reverse sorted array → worst case.
// Array with duplicate elements → works fine, keeps stability.
// Single element or empty array → nothing to sort.


/* Common Questions: */

// What is the time complexity of Bubble Sort?
// How do you optimize Bubble Sort?
// Is Bubble Sort stable? (Yes, it maintains relative order of equal elements.)
// When would you use Bubble Sort in real life?