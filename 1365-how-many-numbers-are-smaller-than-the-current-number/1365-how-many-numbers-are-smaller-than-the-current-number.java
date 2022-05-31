class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        return Arrays.stream(nums)
                    .mapToLong(countSmallerNumbersInArray(nums))
                    .boxed()
                    .mapToInt(Long::intValue)
                    .toArray();
    }
    
    private IntToLongFunction countSmallerNumbersInArray(int[] nums) {
        return i -> Arrays.stream(nums)
                .filter(num -> i > num)
                .count();
    }
}