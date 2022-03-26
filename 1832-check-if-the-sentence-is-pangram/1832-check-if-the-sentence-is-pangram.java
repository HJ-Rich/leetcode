class Solution {
    public boolean checkIfPangram(String sentence) {
        return IntStream.rangeClosed('a', 'z')
                .mapToObj(number -> String.valueOf((char) number))
                .allMatch(sentence::contains);
    }
}