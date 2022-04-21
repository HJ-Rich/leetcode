class Solution {
    public int longestPalindrome(String s) {
        final Map<String, Integer> numberOfCharacters = Arrays.stream(s.split(""))
                .collect(Collectors.toMap(Function.identity(), a -> 1, Integer::sum));

        final int evenCharacters = numberOfCharacters.values()
                .stream()
                .filter(i -> i % 2 == 0)
                .mapToInt(Integer::valueOf)
                .sum();
        
        final int oddCharacters = numberOfCharacters.values()
                .stream()
                .filter(i -> i % 2 == 1)
                .mapToInt(i -> i - 1)
                .sum();

        final boolean existsOdd = numberOfCharacters.values()
                .stream()
                .anyMatch(i -> i % 2 == 1);

        int extra = 0;
        if (existsOdd) {
            extra++;
        }

        return evenCharacters + oddCharacters + extra;
    }
}