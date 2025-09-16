import java.util.Scanner;

public class lengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of strings: ");
        String str = sc.nextLine();

        // --------------------------------------------------------
        // ✅ Optimal Solution (O(1) space, O(n) time)
        // --------------------------------------------------------
        int i = str.length() - 1; // Start from the last character
        int length = 0;

        // Step 1: Skip trailing spaces
        while (i >= 0 && str.charAt(i) == ' ') {
            i--;
        }

        // Step 2: Count characters of the last word
        while (i >= 0 && str.charAt(i) != ' ') {
            length++;
            i--;
        }

        System.out.println("Length of last word is: " + length);

        // --------------------------------------------------------
        // ❌ Old Solution using split() (commented for reference)
        // --------------------------------------------------------
        /*
        String splitStr[] = str.trim().split(" ");
        System.out.println("String after split: " + Arrays.toString(splitStr));
        System.out.println("Length of last word: " + splitStr[splitStr.length - 1].length());
        */

        sc.close();
    }
}

/*
--------------------------------------------------------
📘 NOTES (How the Algorithm Works):
--------------------------------------------------------
1. We start scanning from the end of the string.
2. First, skip all trailing spaces.
3. Then, count characters until we hit another space or reach the start.
4. The count is the length of the last word.

--------------------------------------------------------
📝 DRY RUN Example:
Input: "Hello World   "

Step 1: str.length() = 13 → i = 12, length = 0
- str[12] = ' ' → skip → i=11
- str[11] = ' ' → skip → i=10
- str[10] = ' ' → skip → i=9
- str[9] = 'd' → stop skipping

Step 2: Count characters backwards
- str[9]='d' → length=1, i=8
- str[8]='l' → length=2, i=7
- str[7]='r' → length=3, i=6
- str[6]='o' → length=4, i=5
- str[5]='W' → length=5, i=4
- str[4]=' ' → stop

Final Answer = 5

--------------------------------------------------------
⏱ COMPLEXITY:
- Time Complexity: O(n), where n = length of string
  (in worst case, we scan the whole string once)
- Space Complexity: O(1), no extra array needed

✅ More efficient than the split() approach,
   which uses O(n) extra space for the word array.
--------------------------------------------------------
*/
