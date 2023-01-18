class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        return Arrays.stream(nums)
                    .boxed()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(java.util.Map.Entry.comparingByValue()))
                    .limit(k)
                    .mapToInt(entry -> entry.getKey().intValue())
                    .toArray();
    }
}