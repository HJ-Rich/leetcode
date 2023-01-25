class Solution {
    public int subtractProductAndSum(int n) {
        var product = 1;
        var sum = 0;
        
        final var nums = Arrays.stream(String.valueOf(n).split(""))
                            .map(Integer::valueOf)
                            .toList();
        
        for (final int num : nums) {
            product *= num;
            sum += num;
        }
        
        return product - sum;
    }
}