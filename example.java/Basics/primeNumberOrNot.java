import java.util.ArrayList;
import java.util.Scanner;

public class primeNumberOrNot {
    public static void main (String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n;

        System.out.println("Enter the number : ");
        n = sc.nextInt();

        int cnt = 0;

        //optimize code
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
               cnt++;
                if (n / i != i) {
                    cnt++;
                }
            }
        }

        //Brute force
       /*  for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            } 
        } */

        if (cnt == 2) {
            System.out.println(n+" is a prime number.");
        } else {
            System.out.println(n+" not a prime number.");
        }
        
        sc.close();
    }
}
