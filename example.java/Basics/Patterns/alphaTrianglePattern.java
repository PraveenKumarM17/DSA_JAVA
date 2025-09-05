import java.util.Scanner;

public class alphaTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            char ch = (char)('A' + n - i);
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(ch + j));
            }
            System.out.println();
        }

        /* for (int i = 1 ; i <= n; i++) {
            char ch = 'A'; 
            for (int j = 1 ; j <= i; j++) {
                System.out.print((char)(ch+n-1));
                ch--;
            }
            System.out.println();
        } */

        // Output 
        /* 
         
            E
            ED
            EDC
            EDCB
            EDCBA
         
         */
        

        sc.close();
    }
}
