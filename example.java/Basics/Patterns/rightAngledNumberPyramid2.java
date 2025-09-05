import java.util.Scanner;

public class rightAngledNumberPyramid2 {
    public static void main (String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n,m;

        System.out.println("Enter the height and width of the tringle : ");
        n = sc.nextInt();
        m = sc.nextInt();

        System.out.println();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++ ) {
                if (j <= i) 
                    System.out.print(i+" ");
                    System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
