package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class leaderInArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> temp = new ArrayList<>();

        int max = arr[n-1];

        temp.add(max);

        for (int i = n-2; i >= 0; i--) {
            if (arr[i] > max) {
                temp.add(arr[i]);
                max = arr[i];
            }
        }


        // Brute force
        /* for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i; j < n; j++) {
              if (arr[i] < arr[j]) {
                isLeader = false;
                break;
              }
            }
            if (isLeader) {
                temp.add(arr[i]);
            }
        } */

        System.out.println("The leader array is "+temp);

        sc.close();
    }
}
