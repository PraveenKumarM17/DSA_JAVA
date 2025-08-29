import java.util.Scanner;

public class ctc {

    // XOR division function 
    public static int[] xorfun(int arr[], int garr[]) {
        int[] temp = arr.clone();
        int current = 0;

        while (current <= temp.length - garr.length) {
            if (temp[current] == 1) {
                for (int i = 0; i < garr.length; i++) {
                    temp[current + i] = temp[current + i] ^ garr[i];
                }
            }
            current++;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the message : ");
        int ml = sc.nextInt();

        // array to store the message
        int[] arr = new int[ml];

        System.out.println("Enter the message: ");
        for (int i = 0; i < ml; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the length of the polynomial : ");
        int gl = sc.nextInt();

        // array to store the polynomial function's value
        int[] garr = new int[gl];
        System.out.println("Enter the polynomial value : ");
        for (int i = 0; i < garr.length; i++) {
            garr[i] = sc.nextInt();
        }

        // append zeros to arr 
        int[] appended = new int[ml + gl - 1];
        for (int i = 0; i < ml; i++) {
            appended[i] = arr[i];
        }

        // perform xor operation to get remainder
        int[] remainder = xorfun(appended, garr);

        // extract crc -> last gl-1 bits
        int[] crc = new int[gl - 1];
        for (int i = 0; i < gl - 1; i++) {
            crc[i] = remainder[ml + i];
        }

        // form codeword by adding the message + crc
        int[] codeword = new int[ml + gl - 1];
        for (int i = 0; i < ml; i++) codeword[i] = arr[i];
        for (int i = 0; i < gl - 1; i++) codeword[ml + i] = crc[i];

        System.out.print("CRC bits: ");
        for (int b : crc) System.out.print(b + " ");
        System.out.println();

        System.out.print("Transmitted codeword: ");
        for (int b : codeword) System.out.print(b + " ");
        System.out.println();

        System.out.println("Enter received codeword length : ");
        int[] received = new int[ml + gl - 1];
        for (int i = 0; i < received.length; i++) {
            received[i] = sc.nextInt();
        }

        // check for error in received codeword
        int[] check = xorfun(received, garr);
        boolean error = false;
        for (int b : check) {
            if (b != 0) {
                error = true;
                break;
            }
        }

        if (!error) {
            System.out.println("No error in the received message.");
        } else {
            System.out.println("Error detected in the received message.");
        }

        sc.close();
    }
}
