import java.util.Scanner;

public class rightAngledTrianglePattern {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,m;

        System.out.println("Enter the size (height & width) :");
        n = sc.nextInt();
        m = sc.nextInt();
        
        System.out.println();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j <= i)
                System.out.print("* ");
                System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
