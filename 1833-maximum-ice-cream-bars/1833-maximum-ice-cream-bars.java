class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // Time Complexity: O(nlogn)
        // Space Complexity: O(1)

        Arrays.sort(costs);

        var answer = 0;
        for (int cost : costs) {
            if (coins - cost < 0) {
                break;
            }

            coins -= cost;
            answer++;
        }

        return answer;
    }
}
