class Solution {
    public int maxScore(String s) {
        int answer = 0;

        for (int i = 1; i < s.length(); i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);
            int score = getScoreByTwoStrings(left, right);

            answer = (score > answer) ? score : answer;
        }
        
        return answer;
    }
    
    private int getScoreByTwoStrings(String left, String right) {
        return getScoreByStringAndTargetNumber(left, 0) + getScoreByStringAndTargetNumber(right, 1);
    }

    private int getScoreByStringAndTargetNumber(String string, int targetNumber) {
        int result = 0;
        for (int i = 0; i < string.length(); i++) {
            if (String.valueOf(string.charAt(i)).equals(String.valueOf(targetNumber))) {
                result++;
            }
        }

        return result;
    }
}