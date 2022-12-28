class Solution {
    public int minStoneSum(int[] piles, int k) {
        // Use PriorityQueue sorting reverse order for integer
        // (poll the greatest, minus it by half and round downed itself, add) for k times
        // time complexity : O(n.logn) - for sorting in queue
        // space complexity : O(n) - for queue space

        final var queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int pile : piles) {
            queue.add(pile);
        }

        for (int i = 0; i < k; i++) {
            final var originalValue = queue.poll();
            final var newValue = originalValue - (originalValue / 2);
            queue.add(newValue);
        }

        return queue.stream()
            .mapToInt(i -> i)
            .sum();
    }
}