/*
 * @lc app=leetcode id=1295 lang=java
 *
 * [1295] Find Numbers with Even Number of Digits
 */

// @lc code=start
class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int k = (int) (Math.log10(nums[i]) + 1);
            if (k % 2 == 0) {
                res++;
            }
        }
        return res;
    }
}
// @lc code=end
