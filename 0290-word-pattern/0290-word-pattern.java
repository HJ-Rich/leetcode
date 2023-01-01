class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Time Complexity : O(n)
        // Space Complexity : O(2n)

        final var words = s.split(" ");
        final var charCache = new HashMap<String, String>();
        final var stringCache = new HashMap<String, String>();

        if (pattern.length() != words.length) {
            return false;
        }


        for (int i = 0; i < pattern.length(); i++) {
            final var character = String.valueOf(pattern.charAt(i));
            final var word = words[i];

            if (!charCache.containsKey(character) && !stringCache.containsKey(word)) {
                charCache.put(character, word);
                stringCache.put(word, character);
                continue;
            }

            final var cachedString = charCache.get(character);
            final var cachedChar = stringCache.get(word);

            if (!Objects.equals(character, cachedChar) || !Objects.equals(word, cachedString)) {
                return false;
            }
        }

        return true;
    }
}