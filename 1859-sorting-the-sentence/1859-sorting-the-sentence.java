class Solution {
    public String sortSentence(String s) {
        return Arrays.stream(s.split(" "))
                    .sorted((s1, s2) -> {
                        Integer s1Index = (int) s1.charAt(s1.length() - 1);
                        Integer s2Index = (int) s2.charAt(s2.length() - 1);
                        return s1Index.compareTo(s2Index);
                    })
                    .map(word -> word.substring(0, word.length() - 1))
                    .collect(Collectors.joining(" "));
    }
}