class Solution {
    public int[] runningSum(int[] nums) {
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        final var answer = new int[nums.length];
        
        answer[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i - 1] + nums[i];
        }

        return answer;
    }
}