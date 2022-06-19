class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;

        final String[] split = s.split("");
        for (String s1 : split) {
            if ("(".equals(s1)) {
                depth++;
                maxDepth = Math.max(depth, maxDepth);
            }
            if (")".equals(s1)) {
                depth--;
                maxDepth = Math.max(depth, maxDepth);
            }
        }
        
        return maxDepth;
    }
}