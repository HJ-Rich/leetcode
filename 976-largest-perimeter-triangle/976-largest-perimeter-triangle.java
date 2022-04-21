class Solution {
    public int largestPerimeter(int[] nums) {
        List<Integer> reverseOrdered = Arrays.stream(nums)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        
        for (int i = 0; i < reverseOrdered.size() - 2; i++) {
            final int a = reverseOrdered.get(i);
            final int b = reverseOrdered.get(i + 1);
            final int c = reverseOrdered.get(i + 2);            
            
            final int maxLength = Math.max(a, Math.max(b, c));
            final int sum = a + b + c;
        
            if (maxLength < (sum - maxLength)) {
                return sum;
            }   
        }
        
        return 0;
    }
}