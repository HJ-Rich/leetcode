class Solution {
    public boolean judgeCircle(String moves) {
        int upDown = 0;
        int leftRight = 0;
        final String[] split = moves.split("");
        
        for (final String s : split) {
            if ("U".equals(s)) {
                upDown++;
                continue;
            }
            if ("D".equals(s)) {
                upDown--;
                continue;
            }
            if ("L".equals(s)) {
                leftRight--;
                continue;
            }
            if ("R".equals(s)) {
                leftRight++;
                continue;
            }
        }
        
        return upDown == 0 && leftRight == 0;
    }
}