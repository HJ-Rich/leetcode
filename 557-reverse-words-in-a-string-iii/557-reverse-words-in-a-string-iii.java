class Solution {
    public String reverseWords(String s) {
        return Arrays.stream(s.split(" "))
                    .map(StringBuilder::new)
                    .map(StringBuilder::reverse)
                    .collect(Collectors.joining(" "));
    }
}