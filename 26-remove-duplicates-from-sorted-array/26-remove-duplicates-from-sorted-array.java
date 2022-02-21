class Solution {
    public int removeDuplicates(int[] nums) {
        int[] ints = Arrays.stream(nums).distinct().toArray();
        for (int i = 0; i < ints.length; i++) {
            nums[i] = ints[i];
        }
        
        return ints.length;
    }
}