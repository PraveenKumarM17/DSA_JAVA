import java.util.Scanner;

public class reverseDigitsOfANumber {

    // Method to reverse a number
    static int reverse(int n) {
        int fin = 0;

        while (n != 0) {
            int dig = n % 10;
            n /= 10;

            // Overflow check
            if (fin > 214748364 || (fin == 214748364 && dig > 7)) return 0;
            if (fin < -214748364 || (fin == -214748364 && dig < -8)) return 0;

            fin = fin * 10 + dig;
        }
        return fin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Call reverse method
        int result = reverse(n);

        System.out.println("Reversed number: " + result);
        sc.close();
    }
}
