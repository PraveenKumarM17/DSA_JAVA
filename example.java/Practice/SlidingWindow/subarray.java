import java.util.Arrays;
import java.util.Scanner;

public class subarray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking size input from the user
        int arraySize;
        System.out.println("Enter the size of the array : ");
        arraySize = sc.nextInt();

        // Creating array and taking elements input
        int[] arrayEle = new int[arraySize];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < arraySize; i++) {
            arrayEle[i] = sc.nextInt();
        }

        // Printing all subarrays
        System.out.println("Subarray elements are :");

        // Outer loop → Starting index of subarray
        for (int i = 0; i < arraySize; i++) {
            // Inner loop → Ending index of subarray
            for (int j = i; j < arraySize; j++) {
                // Using builtin array method. TC : O(n^2)
                int[] subArray = Arrays.copyOfRange(arrayEle, i, j + 1);
                System.out.println(Arrays.toString(subArray));
            }
        }

        // Close scanner to avoid resource leak
        sc.close();
    }    
}

/*
================= GIT NOTES =================

1️⃣ Arrays.copyOfRange Explanation:
   - Method: Arrays.copyOfRange(array, start, end)
   - Copies elements from 'start' index to 'end-1' index.
   - Creates a new array each time (uses extra memory).
   - Time complexity: O(length of subarray).

2️⃣ How This Program Works:
   - Takes size and elements of the array as input.
   - Outer loop determines the starting index of subarray.
   - Inner loop determines the ending index of subarray.
   - Arrays.copyOfRange is used to generate the subarray.
   - Each subarray is printed immediately.

3️⃣ Dry Run Example:
   Input:
     arraySize = 3
     arrayEle = [1, 2, 3]

   Output:
     [1]
     [1, 2]
     [1, 2, 3]
     [2]
     [2, 3]
     [3]

4️⃣ Time Complexity:
   - Outer loop: O(n)
   - Inner loop: O(n)
   - copyOfRange: O(k) where k = subarray length.
   - Overall: O(n²).

5️⃣ Space Complexity:
   - O(k) for each subarray (created during copyOfRange).
   - Total extra memory ≈ O(n²) in worst case.

================================================
*/