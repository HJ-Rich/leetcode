class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Time Complexity: O(s.length) -> O(n)
        // Space Complexity: O(2 * s.length) -> O(n)

        final var set = new HashSet<Character>();
        final var map = new HashMap<Character, Character>();

        final var sc = s.toCharArray();
        final var tc = t.toCharArray();

        for (int i = 0; i < sc.length; i++) {
            final var sChar = sc[i];
            final var tChar = tc[i];

            if (!map.containsKey(sChar) && !set.contains(tChar)) {
                map.put(sChar, tChar);
                set.add(tChar);
                continue;
            }

            final var charFromMap = map.get(sChar);
            if (charFromMap != null && tChar == charFromMap) {
                continue;
            }

            return false;
        }

        return true;
    }
}