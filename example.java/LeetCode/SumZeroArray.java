import java.util.Arrays;
import java.util.Scanner;

public class SumZeroArray {

    // Function to generate an array of n unique integers that sum to zero
    public static int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;

        // Add pairs of positive and negative numbers
        for (int i = 1; i <= n / 2; i++) {
            result[index++] = i;
            result[index++] = -i;
        }

        // If n is odd, add 0 in the middle
        if (n % 2 != 0) {
            result[index] = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the size of the array (n): ");
        int n = sc.nextInt();

        // Call function
        int[] result = sumZero(n);

        // Display result
        System.out.println("Array of " + n + " integers summing to zero: " + Arrays.toString(result));

        sc.close();
    }
}

/*
 * Program Notes:
 * 
 * Description:
 * Generates an array of n unique integers such that the sum of all elements is zero.
 * 
 * Algorithm Steps:
 * 1. Initialize an array of size n.
 * 2. Add pairs of numbers (i, -i) from 1 to n/2.
 * 3. If n is odd, add 0 at the end.
 * 4. Return the array.
 * 
 * Dry Run Example:
 * Input: n = 5
 * Pairs: 1,-1 ; 2,-2 -> [1,-1,2,-2]
 * n is odd -> add 0 -> [1,-1,2,-2,0]
 * Output: [1, -1, 2, -2, 0]
 * Sum = 0
 * 
 * Time Complexity: O(n) -> single pass to fill array
 * Space Complexity: O(n) -> array of size n
 */
