class Solution {
    public int minTimeToType(String word) {
        int result = 0;
        char current = 'a';

        char[] chars = word.toCharArray();
        for (char aChar : chars) {
            if (current == aChar) {
                result++;
                continue;
            }

            int sub = Math.abs(current - aChar);
            if (sub > 13) {
                sub = 26 - sub;
            }

            result += sub + 1;
            current = aChar;
        }

        return result;
    }
}