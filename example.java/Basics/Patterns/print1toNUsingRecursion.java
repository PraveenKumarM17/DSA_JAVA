import java.util.Scanner;

public class print1toNUsingRecursion {

    static void fun(int i, int n) {
        if (i > n) return;
        System.out.println(i);
        fun(i+1, n);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the numer : ");
        n = sc.nextInt();

        fun(1,n);

        sc.close();
    }
}
