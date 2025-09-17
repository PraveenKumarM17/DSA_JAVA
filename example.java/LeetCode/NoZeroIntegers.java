import java.util.Arrays;
import java.util.Scanner;

public class NoZeroIntegers {

    // Function to find two integers a and b such that:
    // a + b = n and neither a nor b contains digit 0
    public static int[] getNoZeroIntegers(int n) {
        for (int a = 1; a < n; a++) {
            int b = n - a;
            if (isNoZero(a) && isNoZero(b)) {
                return new int[]{a, b};
            }
        }
        return new int[]{}; // fallback (should not happen as per problem constraints)
    }

    // Helper function to check if a number contains no zero
    private static boolean isNoZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) return false; // zero found
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();

        // Call function
        int[] result = getNoZeroIntegers(n);

        // Display result
        if (result.length == 2) {
            System.out.println("Two no-zero integers whose sum is " + n + ": " + Arrays.toString(result));
        } else {
            System.out.println("No valid pair found.");
        }

        sc.close();
    }
}

/*
 * Program Notes:
 * 
 * Description:
 * Finds two positive integers a and b such that a + b = n and neither contains the digit 0.
 * 
 * Algorithm Steps:
 * 1. Iterate a from 1 to n-1:
 *    - Set b = n - a.
 *    - Check if both a and b contain no zeros using helper function.
 *    - If yes, return {a, b}.
 * 2. Helper function isNoZero(num):
 *    - While num > 0, check if last digit is 0.
 *    - Return false if any 0 found; otherwise return true.
 * 3. Return empty array if no valid pair found (theoretically shouldn't happen).
 * 
 * Dry Run Example:
 * Input: n = 11
 * a=1, b=10 -> b has 0 -> skip
 * a=2, b=9 -> both have no 0 -> return [2,9]
 * Output: [2, 9]
 * 
 * Time Complexity: O(n * d) where d = number of digits in n (checking digits of a and b)
 * Space Complexity: O(1) -> only variables used
 */
