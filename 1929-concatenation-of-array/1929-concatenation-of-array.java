import java.util.*;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int length = nums.length;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            ans[i] = num;
            ans[i + length] = num;
        }
        
        return ans;
    }
}