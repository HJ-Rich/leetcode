class Solution {
    public int findGCD(int[] nums) {
        final int max = Arrays.stream(nums)
                .max()
                .orElse(0);
        final int min = Arrays.stream(nums)
                .min()
                .orElse(0);

        final List<Integer> gcds = new ArrayList<>();
        for (int i = 1; i <= min; i++) {
            if (max % i == 0 && min % i == 0) {
                gcds.add(i);
            }
        }
        
        return gcds.get(gcds.size() - 1);
    }
}