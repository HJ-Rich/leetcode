class Solution {
    public int largestAltitude(int[] gain) {
        int answer = 0;
        int current = 0;
        
        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            answer = Math.max(answer, current);
        }
        
        return answer;
    }
}