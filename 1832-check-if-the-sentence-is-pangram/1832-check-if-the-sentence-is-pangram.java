class Solution {
    public boolean checkIfPangram(String sentence) {
        return IntStream.rangeClosed(97, 122)
                .mapToObj(number -> String.valueOf((char) number))
                .allMatch(sentence::contains);
    }
}