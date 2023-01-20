class Solution {
    public int singleNumber(int[] nums) {
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        final var set = new HashSet<Integer>();

        for (int i : nums) {
            if (set.contains(i)) {
                set.remove(Integer.valueOf(i));
                continue;
            }

            set.add(i);
        }

        return set.iterator().next();
    }
}