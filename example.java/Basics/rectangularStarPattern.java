import java.util.Scanner;

public class rectangularStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,m;

        System.out.println("Enter the size (height & width) :");
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();

    }
}