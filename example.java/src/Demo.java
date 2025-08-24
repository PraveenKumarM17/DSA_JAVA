import java.util.Scanner;

public class Demo {
     public static void main (String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n;

        System.out.println("Enter the number to check whether it is a armstrong number or not : ");
        n = sc.nextInt();

        int temp = n;

        System.out.println();

       int fin = 0;

       while (n != 0) {
        int dig = n % 10;
        fin = fin + (int)Math.pow(dig, 3);
        n = n / 10;
       }

       if (temp == fin) {
        System.out.println(temp+" = "+fin+" It is a armstrong number.");
       } else {
               System.out.println("Its not a armstrong number.");
       }

        sc.close();
    }
}
