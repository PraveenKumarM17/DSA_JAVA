import java.util.Scanner;

public class starPyramid {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n-i+1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j < 2*i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        sc.close();

    }
} 