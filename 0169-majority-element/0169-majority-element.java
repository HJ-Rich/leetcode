class Solution {
    public int majorityElement(int[] nums) {
        final var min = (nums.length / 2) + 1;
        final var counter = new HashMap<Integer, Integer>();

        for (final var num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);

            if (counter.get(num) >= min) {
                return num;
            }
        }

        return 0;
    }
}