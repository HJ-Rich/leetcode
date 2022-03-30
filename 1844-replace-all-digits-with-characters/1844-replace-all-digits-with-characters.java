class Solution {
    public String replaceDigits(String s) {
        final StringBuilder answerBuilder = new StringBuilder(s);
        final char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i += 2) {
            answerBuilder.replace(i, i + 1, shift(chars[i - 1], chars[i]));
        }
        return answerBuilder.toString();
    }
    
    private String shift(char letter, int index) {
        return String.valueOf((char) (letter + Character.getNumericValue(index)));
    }
}