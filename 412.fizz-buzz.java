import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> resultList = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                resultList.add("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                resultList.add("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                resultList.add("Buzz");
                continue;
            }

            // if (i % 3 == 1) {
            // resultList.add("1");
            // }
            // if (i % 3 == 2) {
            // resultList.add("2");
            // }
            resultList.add(i + "");
        }
        return resultList;

    }
}
// @lc code=end
