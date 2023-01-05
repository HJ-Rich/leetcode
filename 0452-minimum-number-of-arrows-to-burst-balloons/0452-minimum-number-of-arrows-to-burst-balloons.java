class Solution {
    public int findMinArrowShots(int[][] points) {
        // Time Complexity: O(nlogn)
        // Space Complexity: O(n)

        Arrays.sort(points, Comparator.comparing(a -> ((int[]) a)[0]).thenComparing(a -> ((int[]) a)[1]));

        var answer = 1;
        var b = points[0][1];

        for (int i = 1; i < points.length; i++) {
            final var c = points[i][0];
            final var d = points[i][1];

            if (b >= c) {
                b = Math.min(b, d);
                continue;
            }

            b = d;
            answer++;
        }

        return answer;
    }
}