class Solution {
    public boolean digitCount(String num) {
        final String[] s = num.split("");
        
        for (int i = 0; i < s.length; i++) {
            final int target = i;
            final int numberOfTarget = Integer.parseInt(s[i]);
            
            if (countNumberOfTarget(s, i) != numberOfTarget) {
                return false;
            }   
        }
        
        return true;
    }
    
    private int countNumberOfTarget(String[] s, int target) {
        int count = 0;
        
        for (String string : s) {
            if (Integer.parseInt(string) == target) {
                count++;
            }
        }
        
        return count;
    }
}