import java.util.Scanner;

public class starPyramid {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height : ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        sc.close();

    }
} 