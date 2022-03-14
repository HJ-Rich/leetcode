import static java.util.stream.Collectors.toList;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        List<String> allowedChars = Arrays.stream(allowed.split(""))
                .collect(toList());
        
        return (int) Arrays.stream(words)
                .filter(word -> isAllowed(word, allowedChars))
                .count();
    }

    private boolean isAllowed(String word, List<String> allowed) {
        return Arrays.stream(word.split(""))
                .allMatch(allowed::contains);
    }
}