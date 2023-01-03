class Solution {
    public boolean isSubsequence(String s, String t) {
        // Time Complexity: O(n)
        // Space Complexity: O(1)

        if (s.isBlank()) {
            return true;
        }

        var sIndex = 0;
        var tIndex = 0;

        while (true) {
            if (tIndex == t.length() || sIndex == s.length()) {
                break;
            }

            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
                tIndex++;
                continue;
            }

            tIndex++;
        }

        return sIndex == s.length();
    }
}