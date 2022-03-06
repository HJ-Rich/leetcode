class Solution {
    private static final String WORD_DELIMITER = " ";
    
    public int mostWordsFound(String[] sentences) {
        int answer = 0;
        
        for (String sentence : sentences) {
            answer = Math.max(answer, countWordsFromSentence(sentence));
        }
        
        return answer;
    }
    
    private int countWordsFromSentence(String sentence) {
        return sentence.split(WORD_DELIMITER).length;
    }
}