class Solution {
    public int minimumSum(int num) {
        List<Integer> nums = Arrays.stream(String.valueOf(num).split(""))
            .map(Integer::parseInt)
            .sorted()
            .collect(Collectors.toList());
        return Integer.parseInt("" + nums.get(0) + nums.get(3)) + Integer.parseInt("" + nums.get(1) + nums.get(2));
    }
}