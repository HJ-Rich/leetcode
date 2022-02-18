class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        return x == Long.parseLong(new StringBuilder(String.valueOf(x)).reverse().toString());
    }
}