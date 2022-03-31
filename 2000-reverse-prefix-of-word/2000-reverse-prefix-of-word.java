class Solution {
    public String reversePrefix(String word, char ch) {
        return new StringBuilder(word.substring(0, word.indexOf(ch) + 1))
                        .reverse()
                        .append(word.substring(word.indexOf(ch) + 1))
                        .toString();
    }
}