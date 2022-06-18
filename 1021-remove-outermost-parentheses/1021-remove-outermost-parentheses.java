class Solution {
    public String removeOuterParentheses(String s) {
        int depth = 0;
        final String[] split = s.split("");
        final StringBuilder answer = new StringBuilder();

        for (final String s1 : split) {
            if ("(".equals(s1)) {
                depth++;
                if (depth > 1) {
                    answer.append(s1);
                }
            }

            if (")".equals(s1)) {
                depth--;
                if (depth > 0) {
                    answer.append(s1);
                }
            }
        }
        
        return answer.toString();
    }
}