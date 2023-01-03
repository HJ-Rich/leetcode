class Solution {
    public int minDeletionSize(String[] strs) {
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)

        var answer = 0;
        outer:
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    answer++;
                    continue outer;
                }
            }
        }

        return answer;
    }
}