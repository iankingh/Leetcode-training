/*
 * @lc app=leetcode id=1089 lang=java
 *
 * [1089] Duplicate Zeros
 */

// @lc code=start
class Solution {
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                // 陣列右移
                for (int j = arr.length - 1; i < j; j--) {
                    arr[j] = arr[j - 1];
                }
                // 取代右一位 = 0
                arr[i + 1] = 0;
                i++;
            }
        }
    }
}
// @lc code=end
