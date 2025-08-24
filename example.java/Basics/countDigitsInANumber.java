import java.util.*;

public class countDigitsInANumber {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digit : ");
        int n = sc.nextInt();

        int count = 0;


        //Optimized Code
        count = (int) (Math.log10(n) + 1);


        //Brute Force 
        /* while(n != 0) {
            n = n/10;
            count++;
        } */

        System.out.print(count);

        sc.close();

    }
}