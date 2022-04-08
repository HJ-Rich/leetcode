class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return (toInt(firstWord) + toInt(secondWord)) == toInt(targetWord);
    }
    
    private int toInt(String firstWord) {
        return Integer.parseInt(Arrays.stream(firstWord.split(""))
                .map(word -> word.charAt(0))
                .mapToInt(Character::getNumericValue)
                .map(value -> value - 10)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining()));
    }
}