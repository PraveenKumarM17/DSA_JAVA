import java.util.Scanner;

public class CRC1 {

    // Method to perform XOR division
    public static void xorDivision(int[] data, int[] divisor, int messageLength) {
        for (int i = 0; i < messageLength; i++) {
            if (data[i] == 1) {
                for (int j = 0; j < divisor.length; j++) {
                    data[i + j] ^= divisor[j];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Data Stream
        System.out.print("Enter message bits: ");
        String message = sc.nextLine();
        System.out.print("Enter generator: ");
        String generator = sc.nextLine();

        int[] data = new int[message.length() + generator.length() - 1];
        int[] divisor = new int[generator.length()];

        // Convert message and generator to int arrays
        for (int i = 0; i < message.length(); i++)
            data[i] = message.charAt(i) - '0';
        for (int i = 0; i < generator.length(); i++)
            divisor[i] = generator.charAt(i) - '0';

        // Calculate CRC
        xorDivision(data, divisor, message.length());

        // Display CRC code (message + remainder)
        System.out.print("The checksum code is: ");
        for (int i = 0; i < message.length(); i++)
            System.out.print(message.charAt(i)); // original message
        for (int i = message.length(); i < data.length; i++)
            System.out.print(data[i]); // CRC bits
        System.out.println();

        // Check input CRC code
        System.out.print("Enter checksum code: ");
        String code = sc.nextLine();
        System.out.print("Enter generator: ");
        generator = sc.nextLine();

        data = new int[code.length()];
        divisor = new int[generator.length()];

        for (int i = 0; i < code.length(); i++)
            data[i] = code.charAt(i) - '0';
        for (int i = 0; i < generator.length(); i++)
            divisor[i] = generator.charAt(i) - '0';

        xorDivision(data, divisor, code.length() - generator.length() + 1);

        // Validate
        boolean valid = true;
        for (int bit : data) {
            if (bit == 1) {
                valid = false;
                break;
            }
        }

        if (valid)
            System.out.println("Data stream is valid");
        else
            System.out.println("Data stream is invalid. CRC error occurred.");

        sc.close();
    }
}
