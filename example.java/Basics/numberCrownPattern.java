import java.util.Scanner;

public class numberCrownPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // left stars
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // right stars
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}


// Sample output
/* 

Enter the Number: 5
*        *
**      **
***    ***
****  ****
**********



Enter the Number: 5
1        1
12      21
123    321
1234  4321
1234554321

 */