class Solution {
    public int numOfStrings(String[] patterns, String word) {
        return (int) Arrays.stream(patterns)
            .filter(character -> word.contains(character))
            .count();
    }
}