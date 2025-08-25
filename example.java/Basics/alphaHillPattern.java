import java.util.Scanner;

public class alphaHillPattern {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(ch+++" ");
            }

            ch--;

            for (int j = 1; j < i; j++) {
                System.out.print(--ch+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
