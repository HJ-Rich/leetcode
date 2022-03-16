class Solution {
    public String sortSentence(String s) {
        return Arrays.stream(s.split(" "))
                .sorted((s1, s2) -> Integer.compare(s1.charAt(s1.length() - 1), s2.charAt(s2.length() - 1)))
                .map(word -> word.substring(0, word.length() - 1))
                .collect(Collectors.joining(" "));
    }
}