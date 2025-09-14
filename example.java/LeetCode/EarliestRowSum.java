import java.util.Scanner;

public class EarliestRowSum {

    // Function to find the row with the minimum sum
    public static int earliestTime(int[][] arr) {
        int sum = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum = 0; // reset sum for each row
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            minValue = Math.min(sum, minValue); // keep track of minimum row sum
        }

        return minValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix row-wise:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Call the function
        int result = earliestTime(arr);

        // Display result
        System.out.println("The minimum row sum (earliest time) is: " + result);

        sc.close();
    }
}

/*
 * Program Notes:
 * 
 * Description:
 * Finds the row in a 2D array (matrix) which has the minimum sum of elements.
 * This can be interpreted as the "earliest time" if each row represents time durations.
 * 
 * Algorithm Steps:
 * 1. Initialize minValue as Integer.MAX_VALUE.
 * 2. Traverse each row:
 *    - Calculate the sum of all elements in the row.
 *    - Update minValue if the current row sum is smaller.
 * 3. Return minValue after all rows are checked.
 * 
 * Dry Run Example:
 * Input matrix:
 * [3, 5, 1]
 * [2, 1, 2]
 * [4, 2, 3]
 * Row sums: 9, 5, 9
 * Minimum row sum: 5
 * Output: 5
 * 
 * Time Complexity: O(rows * cols) -> traverses all elements once
 * Space Complexity: O(1) -> no extra space used except variables
 */
