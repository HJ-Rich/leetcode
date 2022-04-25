class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        List<Integer> orderByAbsDesc = Arrays.stream(nums)
                .boxed()
                .sorted((a, b) -> Integer.compare(Math.abs(b), Math.abs(a)))
                .collect(Collectors.toList());

        for (int i = 0; i < orderByAbsDesc.size(); i++) {
            if (k <= 0) {
                break;
            }
            if (orderByAbsDesc.get(i) < 0) {
                orderByAbsDesc.set(i, orderByAbsDesc.get(i) * -1);
                k--;
            }
        }

        boolean isOdd = k % 2 == 1;
        if (isOdd) {
            orderByAbsDesc = orderByAbsDesc.stream()
                    .sorted((a, b) -> a < 0 && b < 0 ? 
                            Integer.compare(Math.abs(a), Math.abs(b))
                            : Integer.compare(a, b))
                    .collect(Collectors.toList());
            orderByAbsDesc.set(0, orderByAbsDesc.get(0) * -1);
        }

        return orderByAbsDesc.stream()
                .mapToInt(Integer::valueOf)
                .sum();
    }
}