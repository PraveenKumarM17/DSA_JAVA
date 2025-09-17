import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SmallestAbsentNumber {

    // Function to find the smallest absent number greater than the average
    public static int smallestAbsent(int[] nums) {
        int n = nums.length;

        // Calculate average
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int avg = sum / n;

        // Store all numbers in a set
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Start checking from avg + 1
        int candidate = avg + 1;
        while (set.contains(candidate)) {
            candidate++;
        }

        return candidate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call function
        int result = smallestAbsent(nums);

        // Display result
        System.out.println("The smallest absent number greater than the average is: " + result);

        sc.close();
    }
}

/*
 * Program Notes:
 * 
 * Description:
 * Finds the smallest positive integer greater than the average of an array
 * that is not present in the array.
 * 
 * Algorithm Steps:
 * 1. Calculate the average of the array (integer division).
 * 2. Store all array elements in a HashSet for O(1) lookup.
 * 3. Initialize candidate = average + 1.
 * 4. Increment candidate until it is not present in the set.
 * 5. Return candidate.
 * 
 * Dry Run Example:
 * Input: [1, 2, 5, 6]
 * Average: (1+2+5+6)/4 = 3
 * Candidate starts at 4:
 *   - 4 not in array -> return 4
 * Output: 4
 * 
 * Time Complexity:
 * - O(n) for sum + O(n) for building set + O(k) for checking candidate
 * - Overall: O(n + k) where k is usually small
 * 
 * Space Complexity:
 * - O(n) for HashSet
 */
