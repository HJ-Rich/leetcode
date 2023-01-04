class Solution {
    public int minimumRounds(int[] tasks) {
        // Time Complexity: O(n)
        // Space Complexity: O(n)

        final var taskCount = new HashMap<Integer, Integer>();
        for (int i : tasks) {
            taskCount.merge(i, 1, Integer::sum);
        }

        var answer = 0;
        final var counts = taskCount.values().stream().collect(Collectors.toList());

        for (int i = 0; i < counts.size(); i++) {
            var value = counts.get(i);

            if (value == 1) {
                return -1;
            }

            if (value < 4) {
                answer++;
                continue;
            }

            if (value == 4) {
                answer += 2;
                continue;
            }

            final var shareByThree = (value - 2) / 3;
            value -= shareByThree * 3;
            final var shareByTwo = value / 2;
            answer += shareByThree + shareByTwo;
        }

        return answer;
    }
}