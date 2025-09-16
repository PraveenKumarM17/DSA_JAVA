/* import java.util.Scanner;

public class cr7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int messageSize;

        System.out.println("Enter the size of the message : ");
        messageSize = sc.nextInt();

        // Creating an array to hold the message bits
        int[] messageBit = new int[messageSize];
        
        for (int i = 0; i < messageSize; i++){
            messageBit[i] = sc.nextInt();
        }


        int generatorSize;

        System.out.println("Enter the generator lenght : ");
        generatorSize = sc.nextInt();
        
        // Creating an array to hold the generator bits
        int[] generatorBit = new int[generatorSize];

        for (int i = 0; i < generatorSize; i++) {
            generatorBit[i] = sc.nextInt();
        }


        // Append the (generatorSize - 1) to the messageSize

        int[] append = new int[messageSize + (generatorSize - 1)];
        
        for (int i = 0; i < append.length; i++) {
            
        }

    }
}
 */