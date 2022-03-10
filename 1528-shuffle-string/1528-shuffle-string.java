class Solution {
    public String restoreString(String s, int[] indices) {
        String[] answerCharacters = new String[indices.length];
        
        String[] split = s.split("");
        for (int i = 0; i < split.length; i++) {
            answerCharacters[indices[i]] = split[i];
        }

        StringBuilder answer = new StringBuilder();
        for (String answerCharacter : answerCharacters) {
            answer.append(answerCharacter);
        }
        
        return answer.toString(); 
    }
}
