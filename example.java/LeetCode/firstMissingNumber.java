import java.util.Scanner;

public class firstMissingNumber {
    public static void main(String[] args) {

        // Object creation for taking the inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        // Creating an array of size n
        int[] nums = new int[n];

        System.out.println("Enter the array : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Inilizing an hash table of size n+2
        // ie., if the array ends with all element,
        //  the n+1th element is the smallest number required
        boolean[] hash = new boolean[n+2];

        // using for-each loop and marking true if the element is present at its corresponding index
        for (int num : nums) {
            if (num > 0 && num <= n) {
                hash[num] = true;
            }
        }


        // Initialize the missing number to the n+1 th number
        // if every element is present then the missing will print n+1 th element
        int missing = n + 1;

        // Looping to check if there is any missing number
        for (int i = 1; i <= n; i++) {
            if (!hash[i]) {
                missing = i;
                break;
            }
        }

        System.out.println("The smallest missing value is: " + missing);
        sc.close();
    }
}
