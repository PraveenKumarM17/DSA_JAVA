import java.util.Scanner;

public class MaxFreqVowelConsonant {

    // Function to find sum of max frequency vowel and consonant
    public static int maxFreqSum(String str) {
        int[] hash = new int[26]; // frequency array for 'a' to 'z'

        int maxVowel = 0;
        int maxConsonant = 0;

        str = str.toLowerCase(); // handle uppercase letters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch < 'a' || ch > 'z') continue; // skip non-alphabet characters

            hash[ch - 'a']++; // update frequency

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                maxVowel = Math.max(hash[ch - 'a'], maxVowel); // track max vowel frequency
            } else {
                maxConsonant = Math.max(hash[ch - 'a'], maxConsonant); // track max consonant frequency
            }
        }

        return maxVowel + maxConsonant;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Call function
        int result = maxFreqSum(str);

        // Display result
        System.out.println("Sum of most frequent vowel and consonant: " + result);

        sc.close();
    }
}

/*
 * Program Notes:
 * 
 * Description:
 * Finds the sum of the frequency of the most frequent vowel and the most frequent consonant in a string.
 * 
 * Algorithm Steps:
 * 1. Convert the string to lowercase.
 * 2. Initialize a frequency array of size 26 for all letters.
 * 3. Traverse each character:
 *    - Update its frequency in the array.
 *    - If vowel, update maxVowel if its frequency is higher.
 *    - If consonant, update maxConsonant if its frequency is higher.
 * 4. Return the sum of maxVowel and maxConsonant.
 * 
 * Dry Run Example:
 * Input: "Hello World"
 * Frequencies:
 *   Vowels: e=1, o=2 -> maxVowel = 2
 *   Consonants: h=1, l=3, w=1, r=1, d=1 -> maxConsonant = 3
 * Sum = 2 + 3 = 5
 * Output: 5
 * 
 * Time Complexity: O(n) where n = length of string
 * Space Complexity: O(1) (fixed-size array of 26)
 */
