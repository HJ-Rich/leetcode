class Solution {
    public int minimumMoves(String s) {
        int answer = 0;
        StringBuilder stringBuilder = new StringBuilder(s);

        while (stringBuilder.indexOf("X") > -1) {
            stringBuilder = convert(stringBuilder);
            answer++;
        }
        return answer;
    }
    
    private StringBuilder convert(StringBuilder stringBuilder) {
        int x = stringBuilder.indexOf("X");
        stringBuilder.deleteCharAt(x);
        
        try {
            if (stringBuilder.charAt(x) == 'X') {
                stringBuilder.deleteCharAt(x);
                if (stringBuilder.charAt(x) == 'X') {
                    stringBuilder.deleteCharAt(x);
                }
            } else if (stringBuilder.charAt(x + 1) == 'X') {
                stringBuilder.deleteCharAt(x + 1);
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        
        return stringBuilder;
    }
}