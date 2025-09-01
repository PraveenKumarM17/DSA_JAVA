
/* 📒 Notes on Bubble Sort 👇 */

import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting the array using the insertionSorting
        // Check if the previous number is greater than the next number, if 'Yes' swap

        for (int i = 1; i < n; i++){
            // System.out.println("Enter loop : "+i);
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
            // System.out.println("In loop : "+i+"Itteration : "+j);
            arr[j+1] = arr[j];
            j--;
           }
           arr[j+1] = key;
        }

        System.out.println("The array after sorting : ");
        for ( int nums : arr) {
            System.out.print(nums+" ");
        }


        sc.close();

    }
}



/* Notes */

// Insertion Sort is a simple sorting algorithm that builds the final sorted array 
// one element at a time by inserting each element into its correct position.
// Easy to implement.
// Efficient for small datasets or nearly sorted arrays.
// Used in practice for hybrid algorithms like TimSort (Python/Java).


/* Real-life applications: */

// Sorting playing cards in hand.
// Small lists in embedded systems.
// Used as a base case in advanced sorts (Merge Sort/Quick Sort for small arrays).


/* Algorithm Steps: */

// Start from the 2nd element (index 1).
// Compare it with previous elements.
// Shift elements that are greater than the key.
// Insert the key into its correct position.
// Repeat for all elements.


/* Time & Space Complexity */

// Best Case (Already Sorted): O(n)
// Average Case: O(n²)
// Worst Case (Reverse Sorted): O(n²)
// Space Complexity: O(1) → In-place sorting


/* Dry Run Example: */

// Array = [5, 2, 4, 6]
// Step 1: Key = 2 → Compare with 5 → Insert before 5 → [2, 5, 4, 6]
// Step 2: Key = 4 → Compare with 5 → Insert before 5 → [2, 4, 5, 6]
// Step 3: Key = 6 → Already greater → [2, 4, 5, 6]


/* Edge Cases */

// Empty array → No operation.
// Single element → Already sorted.
// Array with duplicates → Still works fine.
// Very large array → Inefficient, avoid using.


/* Common Interview Questions: */

// Implement insertion sort.
// Why is insertion sort adaptive?
// Compare insertion sort with selection sort.
// Modify insertion sort to work with linked lists.
// Explain best, average, and worst cases with examples.