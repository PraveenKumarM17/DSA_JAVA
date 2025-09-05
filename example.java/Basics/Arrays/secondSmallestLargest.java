package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class secondSmallestLargest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Smallest 2nd number is : "+ arr[1]);
        System.out.println("largest 2nd number is : "+ arr[n-2]);

        sc.close();
    }
}
