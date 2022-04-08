import java.util.regex.Pattern;

// https://leetcode.com/problems/number-of-valid-words-in-a-sentence
class Solution {
    private static final String HYPHEN = "-";
    private static final List<String> PUNCTUATIONS = List.of("!", ".", ",");
    private static final int MAXIMUM_PUNCTUATION_NUMBER = 1;
    private static final int FIRST_INDEX = 0;
    private static final List<Character> VALID_CHARACTERS;
    private static final Pattern PATTERN = Pattern.compile("[a-z]");

    static {
        VALID_CHARACTERS = IntStream.rangeClosed(97, 122)
                .mapToObj(i -> (char) i)
                .collect(Collectors.toList());
        VALID_CHARACTERS.add((char) 44);
        VALID_CHARACTERS.add((char) 45);
        VALID_CHARACTERS.add((char) 46);
        VALID_CHARACTERS.add((char) 33);
    }
    
    public int countValidWords(String sentence) {
        return (int) Arrays.stream(sentence.trim().split("\\s+"))
                        .filter(this::validateHyphen)
                        .filter(this::validatePunctuation)
                        .filter(this::validateContaining)
                        .count();
    }
    
    private boolean validateHyphen(String word) {
        final int firstHyphen = word.indexOf(HYPHEN);
        final int lastHyphen = word.lastIndexOf(HYPHEN);

        if (firstHyphen == -1) {
            return true;
        }

        return firstHyphen == lastHyphen
                && firstHyphen != FIRST_INDEX
                && lastHyphen != word.length() - 1
                && PATTERN.matcher(String.valueOf(word.charAt(firstHyphen - 1))).matches()
                && PATTERN.matcher(String.valueOf(word.charAt(firstHyphen + 1))).matches();
    }

    private boolean validatePunctuation(String word) {
        final long count = Arrays.stream(word.split(""))
                .filter(PUNCTUATIONS::contains)
                .count();

        if (count > MAXIMUM_PUNCTUATION_NUMBER || hasPunctuationAtInvalidIndex(word, count)) {
            return false;
        }
        return true;
    }

    private boolean hasPunctuationAtInvalidIndex(String word, long count) {
        return count == 1 && !PUNCTUATIONS.contains(String.valueOf(word.charAt(word.length() - 1)));
    }

    private boolean validateContaining(String word) {
        final char[] chars = word.toCharArray();
        for (char aChar : chars) {
            if (!VALID_CHARACTERS.contains(aChar)) {
                return false;
            }
        }
        return true;
    }
}

// https://leetcode.com/problems/number-of-valid-words-in-a-sentence/discuss/1908274/Java-Regex
// class Solution {
//     public int countValidWords(String sentence) {
//         String [] arr = sentence.trim().split("\\s+");
//         int count=0;
//         for(String str: arr){
//             if(str.matches("[a-z]*([a-z]-[a-z])?[a-z]*[!.,]?")) count++;
//         }
//         return count;
//     }
// }
