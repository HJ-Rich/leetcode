class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Deque<Integer> descendingNums = Arrays.stream(nums)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(ArrayDeque::new));

        List<Integer> answer = new ArrayList<>();
        int sum = 0;
        while (sum <= calculateSum(descendingNums)) {
            Integer pop = descendingNums.pop();
            sum += pop;
            answer.add(pop);
        }
        
        return answer;
    }
    
    private int calculateSum(Deque<Integer> deque) {
        return deque.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}