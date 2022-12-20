class Solution {
    public int[] twoSum(int[] nums, int target) {
        final var cache = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            final int pair = target - nums[i];
            if (cache.containsKey(pair)) {
                return new int[]{cache.get(pair), i};
            }

            cache.put(nums[i], i);
        }
        
        return new int[]{};
    }
}