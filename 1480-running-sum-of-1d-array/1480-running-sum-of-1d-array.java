class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            setValueByIndex(nums, i);
        }
        
        return nums;
    }
    
    private int setValueByIndex(int[] array, int index) {
        if (index == 0) {
            return array[index];
        }

        return array[index] = array[index - 1] + array[index];
    }
}