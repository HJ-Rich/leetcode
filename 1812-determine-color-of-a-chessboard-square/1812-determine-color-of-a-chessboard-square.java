class Solution {
    private static final List<String> EVEN_FILES = List.of("b", "d", "f", "h");
        
    public boolean squareIsWhite(String coordinates) {        
        boolean isEvenFile = EVEN_FILES.contains(coordinates.substring(0, 1));
        boolean isEvenRank = Integer.parseInt(coordinates.substring(1)) % 2 == 0;
        
        if (isEvenFile && !isEvenRank || !isEvenFile && isEvenRank) {
            return true;
        }
        return false;
    }
}