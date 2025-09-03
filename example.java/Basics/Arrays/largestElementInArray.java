package Arrays;

import java.util.Scanner;

public class largestElementInArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int high = 0;
        for (int i = 0; i < n; i++) {
            if (high < arr[i]) {
                int temp = high;
                high = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println("Highest element is : "+high);

        sc.close();
    }
}
