import java.util.Scanner;

public class SlidingWindowMaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input for array size
        System.out.println("Enter the size of the array: ");
        int arraySize = scanner.nextInt();

        // Step 2: Take input for array elements
        System.out.println("Enter the array elements: ");
        int[] numbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Step 3: Take input for window size
        System.out.println("Enter the window size: ");
        int windowSize = scanner.nextInt();

        // Check: window size should not be larger than array
        if (windowSize > arraySize) {
            System.out.println("Window size cannot be greater than array size.");
            scanner.close();
            return;
        }

        // Step 4: Compute the sum of the first window
        int currentWindowSum = 0;
        for (int i = 0; i < windowSize; i++) {
            currentWindowSum += numbers[i];
        }

        int maxWindowSum = currentWindowSum; // Initialize with first window sum

        // Step 5: Slide the window across the array
        for (int i = windowSize; i < arraySize; i++) {
            // Remove the leftmost element and add the new rightmost element
            currentWindowSum = currentWindowSum - numbers[i - windowSize] + numbers[i];

            // Update max if current window sum is greater
            maxWindowSum = Math.max(maxWindowSum, currentWindowSum);
        }

        // Step 6: Print the result
        System.out.println("The maximum window sum is: " + maxWindowSum);

        scanner.close();
    }
}

/*
------------------------------------------------------------
📘 Dry Run Example
------------------------------------------------------------

Input:
Array size = 6
Array = [1, 2, 3, 4, 5, 6]
Window size = 3

Execution Steps:
1. First window (first 3 elements):
   currentWindowSum = 1 + 2 + 3 = 6
   maxWindowSum = 6

2. Slide window → [2, 3, 4]
   currentWindowSum = (6 - 1) + 4 = 9
   maxWindowSum = max(6, 9) = 9

3. Slide window → [3, 4, 5]
   currentWindowSum = (9 - 2) + 5 = 12
   maxWindowSum = max(9, 12) = 12

4. Slide window → [4, 5, 6]
   currentWindowSum = (12 - 3) + 6 = 15
   maxWindowSum = max(12, 15) = 15

Output:
The maximum window sum is: 15

------------------------------------------------------------
⚡ Complexity Analysis
------------------------------------------------------------
Time Complexity:
- First window calculation: O(k)
- Sliding the window across array: O(n - k)
- Overall = O(n)

Space Complexity:
- Only a few variables used, independent of input size.
- Overall = O(1)

------------------------------------------------------------
✅ Sliding Window is efficient because instead of recalculating
the sum of each window (O(n*k)), we reuse the previous sum by 
subtracting the element that goes out and adding the new one.
This makes the algorithm O(n).
------------------------------------------------------------
*/
