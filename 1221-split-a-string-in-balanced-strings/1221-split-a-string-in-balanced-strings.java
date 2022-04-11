class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int answer = 0;
        final String[] split = s.split("");
        
        for (String s1 : split) {
            if ("L".equals(s1)) {
                count++;
            } else if ("R".equals(s1)) {
                count--;
            }
            if (count == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}