/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    // 暴力解法
    public double myPow(double x, int n) {
        double res = 1;
        boolean negative = false;
        if (n < 0) {
            negative = true;
            n *= -1;
        }
        for (int i = 0; i < n; i++) {
            res *= x;
        }
        if (negative) {
            res = 1 / res;
        }
        return res;

    }
}
// @lc code=end
