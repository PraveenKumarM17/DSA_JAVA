import java.util.Scanner;

public class printNto1UsingRecursion {

    static void fun(int n) {
        if (n < 1) return;
        System.out.println(n);
        fun(n-1);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the numer : ");
        n = sc.nextInt();

        fun(n);

        sc.close();
    }
}
