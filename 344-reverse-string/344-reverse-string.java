class Solution {
    public void reverseString(char[] s) {
        StringBuilder answerBuilder = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
            answerBuilder.append(s[i]);
        }
        
        final char[] chars = answerBuilder.toString().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            s[i] = chars[i];
        }
    }
}