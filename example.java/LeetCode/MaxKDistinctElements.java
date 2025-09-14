import java.util.Arrays;
import java.util.Scanner;

public class MaxKDistinctElements {

    // Function to find the k largest distinct elements
    public static int[] maxKDistinct(int[] arr, int k) {

        // Step 1: Sort the array in ascending order
        Arrays.sort(arr);

        // Step 2: Reverse the array to get descending order
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Step 3: Collect the first k distinct elements
        int cnt = 0;
        int[] res = new int[Math.min(k, arr.length)];
        if (arr.length > 0) res[cnt++] = arr[0];

        for (int i = 1; i < arr.length && cnt < k; i++) {
            if (arr[i] != arr[i - 1]) { // skip duplicates
                res[cnt++] = arr[i];
            }
        }

        return Arrays.copyOf(res, cnt); // return only filled part
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        // Call the function
        int[] result = maxKDistinct(arr, k);

        // Display the result
        System.out.println("The " + k + " largest distinct elements are: " + Arrays.toString(result));

        sc.close();
    }
}

/*
 * Program: MaxKDistinctElements
 * 
 * Description:
 * This program finds the k largest distinct elements from a given integer array.
 * It ensures that duplicates are not counted and the elements are returned in descending order.
 * 
 * Algorithm Steps:
 * 1. Sort the array in ascending order using Arrays.sort().
 * 2. Reverse the sorted array to get descending order.
 * 3. Initialize a result array of size min(k, arr.length) to store distinct elements.
 * 4. Traverse the array:
 *    - Add the first element to the result.
 *    - For every subsequent element, add it only if it is different from the previous element.
 *    - Stop once k distinct elements are added.
 * 5. Return the result array (trimmed to contain only filled elements).
 * 
 * Dry Run Example:
 * Input: arr = [4, 1, 2, 2, 3], k = 3
 * Step 1: Sorted ascending: [1, 2, 2, 3, 4]
 * Step 2: Reversed: [4, 3, 2, 2, 1]
 * Step 3: Pick distinct elements:
 *         - 4 -> add
 *         - 3 -> add
 *         - 2 -> add (stop since k=3)
 * Output: [4, 3, 2]
 * 
 * Time Complexity:
 * - Sorting: O(n log n)
 * - Traversing for distinct elements: O(n)
 * - Overall: O(n log n)
 * 
 * Space Complexity:
 * - O(k) for the result array
 * - O(1) extra space otherwise (in-place reverse)
 * 
 * Key Points:
 * - Works correctly even if k > number of distinct elements.
 * - Maintains descending order of the largest elements.
 * - Avoids duplicates using simple comparison with previous element.
 */
