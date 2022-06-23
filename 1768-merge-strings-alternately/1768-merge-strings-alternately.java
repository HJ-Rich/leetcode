class Solution {
    public String mergeAlternately(String word1, String word2) {
        final Deque<String> words1 = new ArrayDeque<>(getStrings(word1));
        final Deque<String> words2 = new ArrayDeque<>(getStrings(word2));
        final StringBuilder answer = new StringBuilder();

        while (true) {
            pollAndAppend(words1, answer);
            pollAndAppend(words2, answer);

            if (allDequesAreEmpty(words1, words2)) {
                return answer.toString();
            }
        }
    }
    
    private List<String> getStrings(final String word1) {
        return Arrays.stream(word1.split(""))
                .collect(Collectors.toList());
    }

    private void pollAndAppend(final Deque<String> deque, final StringBuilder answer) {
        if (!deque.isEmpty()) {
            answer.append(deque.poll());
        }
    }

    private boolean allDequesAreEmpty(final Deque<String> words1, final Deque<String> words2) {
        return words1.isEmpty() && words2.isEmpty();
    }
}