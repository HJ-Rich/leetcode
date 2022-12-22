class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        final var nums = new ArrayList<Integer>();
        for (final int i : nums1) {
            nums.add(i);
        }
        for (final int i : nums2) {
            nums.add(i);
        }
        Collections.sort(nums);

        final var size = nums.size();
        final var index = nums.size() / 2;
        if (size % 2 == 0) {
            return (nums.get(index) + nums.get(index - 1)) / 2.0;
        }

        return nums.get(index);
    }
}