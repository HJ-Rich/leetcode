class Solution {
    public boolean detectCapitalUse(String word) {
        // Time Complexity: O(n)
        // Space Complexity: O(n)

        final var upperStart = word.charAt(0) < 97;
        final var wordExceptFirstChar = word.substring(1);
        
        if (upperStart) {
            if (allUpperCase(wordExceptFirstChar) || allLowerCase(wordExceptFirstChar)) {
                return true;
            }
        } 
        
        if (allLowerCase(word)) {
            return true;
        }
    
        return false;
    }

    private boolean allUpperCase(String word) {
        for (char c : word.toCharArray()) {
            if (c >= 97) {
                return false;
            }
        }

        return true;
    }

    private boolean allLowerCase(String word) {
        for (char c : word.toCharArray()) {
            if (c < 97) {
                return false;
            }
        }

        return true;
    }
}