class Solution {
    private static final String[] CODES = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    private static final int ALPHABET_TO_ASCII = 97;
    
    public int uniqueMorseRepresentations(String[] words) {
        return (int) Arrays.stream(words)
                        .map(this::getMorseWord)
                        .distinct()
                        .count();
    }
    
    private String getMorseWord(String word) {
        return word.chars()
                .mapToObj(i -> CODES[i - ALPHABET_TO_ASCII])
                .collect(Collectors.joining());
    }
}