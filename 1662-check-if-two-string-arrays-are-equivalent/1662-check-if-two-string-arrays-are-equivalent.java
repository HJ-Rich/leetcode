class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return getSortedString(word1).equals(getSortedString(word2));
    }

    private String getSortedString(String[] words) {
        return Arrays.stream(words)
                .flatMap(word -> Arrays.stream(word.split("")))
                .collect(Collectors.joining());
    }
}