import java.util.Arrays;
import java.util.Scanner;

public class reverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            // System.out.print(arr[i]+" ");
        }

        int x = arr.length;

        // Reverse the string 
        int[] arr2 = new int[x];
        int k = 0;
        for (int i = x-1; i >= 0; i--) {
            arr2[k] = arr[i];
            k++;
        }

        System.out.println(Arrays.toString(arr2));

        sc.close();

    }
}
