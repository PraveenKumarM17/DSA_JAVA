import java.util.*;

public class DemoFile {

    public static int findGCD(int n1, int n2) {

        for (int i = Math.min(n1, n2); i > 0 ; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return 0;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Numbers(N1 & N2) : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int gcd = findGCD(n1,n2);

        System.out.println("The GCD of "+n1+" and "+n2+" is "+gcd);

        sc.close();

    }
}