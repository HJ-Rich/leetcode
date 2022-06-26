class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        return (int) Arrays.stream(text.split(" "))
                        .filter(s -> validate(s, brokenLetters))
                        .count();
    }
    
    private boolean validate(String target, String brokenLetters) {
        return Arrays.stream(target.split(""))
                    .noneMatch(s -> brokenLetters.indexOf(s) > -1);
    }
}