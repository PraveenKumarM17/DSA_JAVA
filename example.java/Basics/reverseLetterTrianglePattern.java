import java.util.Scanner;

public class reverseLetterTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = n ; j >= i; j--) {
                System.out.print(ch++);
            }
            System.out.println();
        }

        sc.close();
    }
}
