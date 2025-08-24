import java.util.Scanner;

public class numberIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dig , fin = 0;

        System.out.println("Enter the digit : ");
        int n = sc.nextInt();

        int org = n;

        while (n != 0) {
            dig = n % 10;
            fin = fin * 10 + dig;
            n = n / 10;
        }

        if (org == fin) {

            System.out.println("It is a Palindrome.");
        } else {

            System.out.println("It is a not Palindrome.");
        }

        sc.close();
    }
}
