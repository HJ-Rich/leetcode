class Solution {
    private static final String A = "a";
    private static final String B = "b";
    
    public boolean checkString(String s) {
        final int lastAIndex = s.lastIndexOf(A);
        final int firstBIndex = s.indexOf(B);
        return firstBIndex == -1 || firstBIndex > lastAIndex;
    }
}