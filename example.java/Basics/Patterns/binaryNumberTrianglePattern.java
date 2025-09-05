import java.util.Scanner;

public class binaryNumberTrianglePattern {
     public static void main (String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n;

        System.out.println("Enter the size of the tringle : ");
        n = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((j+i) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

        sc.close();
    }
}
