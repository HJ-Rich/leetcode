class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        
        final List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                break;
            }
            
            if (nums[i] == target) {
                answer.add(i);
            }
        }
        
        return answer;
    }
}