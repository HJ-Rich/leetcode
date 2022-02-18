import java.util.Arrays;

class Solution {
    public int search(int[] nums, int target) {
        int indexOfTarget = Arrays.binarySearch(nums, target);
        return indexOfTarget >= 0 ? indexOfTarget : -1;
    }
}