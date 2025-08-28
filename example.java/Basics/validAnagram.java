import java.util.Scanner;

public class validAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        s = s.toLowerCase();
        t = t.toLowerCase();

        int[] hash = new int[26];

        for (int c : s.toCharArray()) {
            hash[c - 'a']++;
        }
        for (int c : t.toCharArray()) {
            hash[c - 'a']--;
        }

        for (int num : hash) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }


    // this even check for upper & lower specifically
    
   /*  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
        return false;
    }

    // Array for 52 slots (A–Z and a–z)
    int[] count = new int[52];

    for (char c : s.toCharArray()) {
        if (Character.isLowerCase(c)) {
            count[c - 'a']++;
        } else {
            count[26 + (c - 'A')]++;
        }
    }

    for (char c : t.toCharArray()) {
        if (Character.isLowerCase(c)) {
            count[c - 'a']--;
        } else {
            count[26 + (c - 'A')]--;
        }
    }

    for (int num : count) {
        if (num != 0) {
            return false;
        }
    }

    return true;
} */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string(s) : ");
        String s = sc.next();

        System.out.println("Enter the string(t) : ");
        String t = sc.next();

        boolean res = isAnagram(s,t);

        if (res) {
            System.out.println(s+" and "+t+" are a valid Anagram.");
        } else {
            System.out.println(s+" and "+t+" are not a valid Anagram.");
        }

        sc.close();
    }
}
