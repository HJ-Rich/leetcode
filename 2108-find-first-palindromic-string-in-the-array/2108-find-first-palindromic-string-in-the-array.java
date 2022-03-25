class Solution {
    public String firstPalindrome(String[] words) {
        return Arrays.stream(words)
            .filter(word -> isPalindromic(word))
            .findFirst()
            .orElse("");
    }
    
    private boolean isPalindromic(String word) {
        int centerIndex = word.length() / 2;
        String firstHalf = word.substring(0, centerIndex);
        String secondHalf = word.substring(centerIndex + 1);
        if (word.length() % 2 == 0) {
            secondHalf = word.substring(centerIndex);
        }
        
        return new StringBuilder(firstHalf)
                    .reverse()
                    .toString()
                    .equals(secondHalf);
    }
}