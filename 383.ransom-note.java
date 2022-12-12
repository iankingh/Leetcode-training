import java.util.HashMap;

/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> maggazineLetters = new HashMap<>();// k= 26
        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);

            int currenCount = maggazineLetters.getOrDefault(m, 0);
            maggazineLetters.put(m, currenCount + 1);
        }
        // bounded by m
        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);
            int currenCount = maggazineLetters.getOrDefault(r, 0);

            if (currenCount == 0) {
                return false;
            }
            maggazineLetters.put(r, currenCount - 1);

        }
        return true;
    }
}
// @lc code=end
