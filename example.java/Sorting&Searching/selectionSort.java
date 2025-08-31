
/* Notes Given down 👇 */


import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting the array using the selectionSorting
        // use minIndex to keep track of the smallest element

        for (int i = 0; i < n ; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap takes place 
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("The array after sorting : ");
        for ( int nums : arr) {
            System.out.print(nums+" ");
        }


        sc.close();
    }
}




/* Notes */


// A simple comparison-based sorting algorithm.
// It repeatedly finds the minimum (or maximum) element from the unsorted part and places it at the beginning.
// Works well for small datasets.
// Useful when memory writes are costly (it does minimal swaps).


/* Steps of Selection Sort: */

// 1. Start with the first index (i = 0).
// 2. Find the smallest element in the remaining unsorted array.
// 3. Swap it with arr[i].
// 4. Move to next index (i+1) and repeat until sorted.


/* Time & Space Complexity */

// => Time Complexity:
//      Best Case → O(n²)
//      Average Case → O(n²)
//      Worst Case → O(n²)
// => Space Complexity: O(1) (in-place sorting)

// => Stability: Not stable (unless modified).


/* Dry Run Example: */

// Array = [29, 10, 14, 37, 13]
// Pass 1: min = 10 → swap → [10, 29, 14, 37, 13]
// Pass 2: min = 13 → swap → [10, 13, 14, 37, 29]
// Pass 3: min = 14 → already in place → [10, 13, 14, 37, 29]
// Pass 4: min = 29 → swap → [10, 13, 14, 29, 37]
// Sorted = [10, 13, 14, 29, 37]


/* Edge Cases */

// 1. Empty array → no operations.
// 2. Array with one element → already sorted.
// 3. Array with all identical elements → minimal swaps, but still O(n²).


/* Common Questions: */

// 1. Explain selection sort and its working principle.
// 2. What is its time complexity and space complexity?
// 3. Why is it not suitable for large datasets?
// 4. How many swaps does it perform in worst case? (At most n-1).
// 5. Can we make it stable? How?