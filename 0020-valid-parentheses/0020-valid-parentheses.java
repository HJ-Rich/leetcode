class Solution {
    public boolean isValid(String s) {
        final var stack = new ArrayDeque<Character>();
        final var sArr = s.toCharArray();

        for (char c : sArr) {
            if (isOpening(c)) {
                stack.addFirst(c);
                continue;
            }

            if (Objects.isNull(stack.peek())) {
                return false;
            }

            if (isPair(c, stack.peek())) {
                stack.pollFirst();
                continue;
            }

            return false;
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }

    public boolean isOpening(final char c) {
        if (c == '(' || c == '{' || c == '[') {
            return true;
        }

        return false;
    }

    public boolean isPair(final char c, final char c2) {
        if (c == ')' && (c - c2 == 1)) {
            return true;    
        }

        if (c - c2 == 2) {
            return true;
        }

        return false;
    }
}