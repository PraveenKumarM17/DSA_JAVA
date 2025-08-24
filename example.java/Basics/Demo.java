import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
     public static void main (String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n;

        System.out.println("Enter the number : ");
        n = sc.nextInt();

        ArrayList<Integer> divisors = new ArrayList<>();

        int sqrtN = (int)Math.sqrt(n);

        //optimize code
        for (int i = 1; i <= sqrtN; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (n / i != i) {
                    divisors.add(n/i);
                }
            }
        }

        //Brute force
       /*  for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        } */

        System.out.println(divisors);

        
        sc.close();
    }
}
