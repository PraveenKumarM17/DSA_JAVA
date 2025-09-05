import java.util.Scanner;

public class sumOfNNaturalNumbers {
    static void fun(int n,int sum) {
        if (n == 0) {
            System.out.println("Sum = "+sum);
            return;
        }
        fun(n-1,sum+n);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the numer : ");
        n = sc.nextInt();

        fun(n,0);

        sc.close();
    }
}
