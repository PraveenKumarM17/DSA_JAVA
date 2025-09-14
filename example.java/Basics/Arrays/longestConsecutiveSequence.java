package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class longestConsecutiveSequence {
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
        
        int max = 1;
        int cnt = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i-1] + 1) {
                cnt++;
                max = Math.max(max, cnt);
            } else if (arr[i] != arr[i - 1]) {
                cnt = 1;
            }
        }

        System.out.println("The longest sequence is :"+max);

        sc.close();
    }
}