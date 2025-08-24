import java.util.Scanner;

public class invertedRightPyramid {
    public static void main (String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n;

        System.out.println("Enter the size of the tringle : ");
        n = sc.nextInt();

        System.out.println();


        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++ ) {
                if (j <= i) 
                    System.out.print("* ");
                    System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
