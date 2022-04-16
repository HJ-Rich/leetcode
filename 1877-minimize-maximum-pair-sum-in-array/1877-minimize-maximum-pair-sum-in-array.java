class Solution {
    public int minPairSum(int[] nums) {
        final List<Integer> sortedNums = Arrays.stream(nums)
                                                .sorted()
                                                .boxed()
                                                .collect(Collectors.toList());

        int maxPairSum = Integer.MIN_VALUE;
        for (int i = 0, j = sortedNums.size() - 1; i < sortedNums.size() / 2; i++, j--) {
            if (sortedNums.get(i) + sortedNums.get(j) > maxPairSum) {
                maxPairSum = sortedNums.get(i) + sortedNums.get(j);
            }
        }
        
        return maxPairSum;
    }
}