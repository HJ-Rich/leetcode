class Solution {
    public int[] buildArray(int[] nums) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = nums[nums[i]];
        }
        
        return answer;
    }
}