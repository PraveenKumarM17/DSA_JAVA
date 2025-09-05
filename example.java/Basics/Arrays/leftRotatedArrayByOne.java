package Arrays;

import java.util.Scanner;

public class leftRotatedArrayByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the steps of rotation : ");
        int k = sc.nextInt();

        // just rotate left by one number
        /* int last = arr[0];
        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = last;
         */

         int[] temp = new int[n];


        //  Copied the right half of the array to the starting of the array
         int j = 0;
         for (int i = k+1; i < n; i++) {
            temp[j] = arr[i];
            j++;
         }

        // Copy the values before the k to the next temp
        for (int i = 0; i <= k; i++) {
            temp[j] = arr[i];
            j++;
        }

        System.out.println("The array after sorting : ");
        for ( int nums : temp) {
            System.out.print(nums+" ");
        }


        sc.close();

    }
}
