class Solution {
    public int minOperations(int[] nums) {
        int answer = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            while (nums[i] >= nums[i + 1]) {
                nums[i + 1]++;
                answer++;
            }
        }
        
        return answer;
    }
}