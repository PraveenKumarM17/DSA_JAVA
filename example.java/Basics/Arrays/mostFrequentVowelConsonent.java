package Arrays;

import java.util.Scanner;

public class mostFrequentVowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine().toLowerCase();

        int[] hash = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            hash[ch - 'a']++;
        }

        int maxVowel = 0;
        int maxConsonent = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                maxVowel = Math.max(hash[ch - 'a'], maxVowel);
            } else {
                maxConsonent = Math.max(hash[ch - 'a'], maxConsonent);
            }
        }

        System.out.println("The sum of maxVowel & maxConsonent : "+(maxVowel + maxConsonent));

        sc.close();
    }
}


/*
 * Program: mostFrequentVowelConsonent
 * 
 * Description:
 * This program finds the most frequent vowel and consonant in a given string
 * and prints the sum of their frequencies.
 * 
 * Approach:
 * 1. Convert the input string to lowercase to handle both uppercase and lowercase letters.
 * 2. Use a hash array of size 26 to count the occurrences of each alphabet character.
 * 3. Traverse the string and update the count for each character in the hash array.
 * 4. Identify vowels ('a', 'e', 'i', 'o', 'u') and consonants.
 * 5. Calculate the maximum frequency for vowels and consonants separately.
 * 6. Print the sum of maxVowel and maxConsonant frequencies.
 * 
 * Key Points:
 * - Uses ASCII values to map characters to indices in the hash array.
 * - Time Complexity: O(n) where n is the length of the string.
 * - Space Complexity: O(1) (constant space for hash array of size 26).
 * 
 * Example:
 * Input: "Hello World"
 * Most frequent vowel: 'o' (2 times)
 * Most frequent consonant: 'l' (3 times)
 * Output: 5
 */

