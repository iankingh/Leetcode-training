/*
 * @lc app=leetcode id=1672 lang=java
 *
 * [1672] Richest Customer Wealth
 */

// @lc code=start
class Solution {
    public int maximumWealth(int[][] accounts) {
         // int[] accountsums; 
         int returns = 0;

         for (int i = 0 ; i < accounts.length;i++ ){
               int sum  = 0;
               for (int j = 0; j < accounts[i].length; j++) { 
                     sum += accounts[i][j];
             }
             //判斷是否為最大sum
             if(sum > returns) {
                 returns = sum;
             } 
         }
         return returns;
     
    }
}
// @lc code=end

