class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int answer = 0;
        
        for (String s : patterns) {
            if (word.contains(s)) {
                answer++;
            }
        }
        
        return answer;
    }
}