import java.util.Scanner;

public class symmetricVoidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        
        for (int i = n; i >= 1; i--) {

            // For printing the right angled triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // for leaving the space inbetween
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // for printing the mirror triangle
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }

        //just inverse the row loop in decreasing order
        for (int i = 1; i <= n; i++) {

            // For printing the right angled triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // for leaving the space inbetween
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // for printing the mirror triangle
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
        sc.close();
    }
}




// Sample output

// Enter the Number: 5
// * * * * * * * * * * 
// * * * *     * * * * 
// * * *         * * * 
// * *             * * 
// *                 * 
// *                 * 
// * *             * * 
// * * *         * * * 
// * * * *     * * * *
// * * * * * * * * * *