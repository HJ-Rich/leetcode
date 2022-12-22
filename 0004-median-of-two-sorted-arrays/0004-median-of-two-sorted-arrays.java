class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        final var nums = Stream.of(nums1, nums2)
                .flatMap(array -> Arrays.stream(array).boxed())
                .sorted()
                .collect(Collectors.toList());

        final var size = nums.size();
        final var index = nums.size() / 2;
        if (size % 2 == 0) {
            return (nums.get(index) + nums.get(index - 1)) / 2.0;
        }

        return nums.get(index);
    }
}