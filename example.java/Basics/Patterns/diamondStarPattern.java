import java.util.Scanner;

public class diamondStarPattern {
    public static void main (String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n;

        System.out.println("Enter the size of the tringle : ");
        n = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n-i+1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j < 2*i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
         for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
