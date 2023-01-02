class Solution {
    public int pivotIndex(int[] nums) {
        // Time Complexity: O(n)
        // Space Complexity; O(1)

        var rightSum = -nums[0];
        for (int i : nums) {
            rightSum += i;
        }

        if (rightSum == 0) {
            return 0;
        }

        var leftSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            final var curruent = nums[i];
            if (leftSum == rightSum - curruent) {
                return i;
            }

            leftSum += curruent;
            rightSum -= curruent;
        }

        return -1;
    }
}