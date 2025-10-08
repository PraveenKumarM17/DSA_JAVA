package Arrays.Medium;

import java.util.*; // Import all util classes

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int arraySize = sc.nextInt();

        int[] arr = new int[arraySize];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arraySize; i++) {
            arr[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int result = sol.longestConsecutive(arr);

        System.out.println("The length of the longest consecutive sequence is: " + result);

        sc.close();
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {

        // Step 1: Edge case - if empty array
        if (nums.length == 0) {
            return 0;
        }

        // Step 2: Store all numbers in a HashSet for O(1) lookup
        HashSet<Integer> set = new HashSet<>();
        for (int val : nums) {
            set.add(val);
        }

        int longest = 0;

        // Step 3: Check for the start of a sequence
        for (int val : set) {
            if (!set.contains(val - 1)) { // means 'val' can be a start
                int currentNum = val;
                int currentStreak = 1;

                // Step 4: Count all consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Step 5: Keep the max streak
                longest = Math.max(longest, currentStreak);
            }
        }

        return longest;
    }
}


/*
---------------------------------------------------------------
🧠 EXPLANATION & NOTES
---------------------------------------------------------------

🔹 Problem:
Find the length of the longest consecutive sequence in an unsorted array.

Example:
Input  -> [100, 4, 200, 1, 3, 2]
Output -> 4
Reason -> The longest consecutive numbers are [1, 2, 3, 4].

---------------------------------------------------------------
💡 ALGORITHM:
---------------------------------------------------------------
1. Handle the edge case when the array is empty.
2. Store all array elements in a HashSet → this allows O(1) lookup.
3. For each number:
   - If (val - 1) doesn’t exist, that means ‘val’ is the start of a sequence.
4. From each sequence start:
   - Keep checking (val + 1), (val + 2), ... as long as they exist.
   - Count how long the sequence is.
5. Keep track of the longest such sequence found.

---------------------------------------------------------------
🧮 DRY RUN:
---------------------------------------------------------------
nums = [100, 4, 200, 1, 3, 2]
set  = {100, 4, 200, 1, 3, 2}

Loop through set:
  val = 100 → 99 not in set → start
      -> 101 not in set → streak = 1
  val = 4   → 3 in set → skip
  val = 200 → 199 not in set → start
      -> 201 not in set → streak = 1
  val = 1   → 0 not in set → start
      -> 2, 3, 4 found → streak = 4

✅ longest = 4

---------------------------------------------------------------
⏱️ COMPLEXITY ANALYSIS:
---------------------------------------------------------------
Time Complexity:
  - Inserting all elements in HashSet: O(n)
  - Outer loop: O(n)
  - Inner while loop (amortized): O(1)
  ✅ Total → O(n)

Space Complexity:
  - HashSet stores all elements → O(n)

---------------------------------------------------------------
📘 SUMMARY:
---------------------------------------------------------------
✅ Use HashSet for fast lookup
✅ Check only sequence starts
✅ Count consecutive elements
✅ Keep track of max length

---------------------------------------------------------------
*/