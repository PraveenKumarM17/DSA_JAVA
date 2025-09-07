package Arrays;

import java.util.Scanner;

public class longestSubArry {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Take array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Input the sum k : ");
        int k = sc.nextInt();

        int maxLen = 0;

        // Brute force O(n^2)
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        System.out.println("The length of the longest sub array is : " + maxLen);
        sc.close();
    }
}
