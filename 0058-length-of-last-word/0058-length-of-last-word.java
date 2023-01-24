class Solution {
    public int lengthOfLastWord(String s) {
        var answer = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') continue;

            answer++;
            if (i == 0 || s.charAt(i -1) == ' ') break;
        }
        
        return answer;
    }
}