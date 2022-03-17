/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {

        // [2,7,1,8] => [2,7,1,9]
        for (int i = digits.length - 1; i >= 0; i--) {
            int digit = digits[i];
            if (digit < 9) {
                digits[i] = digit + 1;
                return digits;
            }
            // [3,9,9] => [4,0,0]
            else {
                digits[i] = 0;
            }
        }
        // [9,9] => [1,0,0]
        int[] answer = new int[digits.length + 1];
        answer[0] = 1;
        return answer;

    }

}
// @lc code=end
