import java.util.Scanner;

// Recursive method
public class factorialOfANumber {

    static int fact(int n, int sum) {
        if (n == 0 || n == 1) return sum;
        return fact(n-1,sum*n);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numer : ");
        int n = sc.nextInt();


        // Iterative method
       /*  int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        } */

        System.out.println("The factorial of "+n+" is : "+fact(n,1));

        sc.close();
    }
}
