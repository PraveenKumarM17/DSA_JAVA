import java.util.*;

public class DemoFile {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digit : ");
        int n = sc.nextInt();

        int dig,fin = 0;

        while (n != 0) {
            dig = n % 10;
            fin = fin * 10 + dig;
            n = n / 10;
        }

        System.out.print(fin);

        sc.close();

    }
}