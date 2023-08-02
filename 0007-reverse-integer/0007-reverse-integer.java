class Solution {
    public int reverse(int x) {
        final boolean isMinus = x < 0;
        final String in = getMinusFilteredInput(x, isMinus);

        final StringBuilder outputBuilder = new StringBuilder(in).reverse();
        removeZeroAtFront(outputBuilder, isMinus);

        return parseAsInt(outputBuilder, isMinus);
    }

    private String getMinusFilteredInput(final long x, final boolean isMinus) {
        if (isMinus) {
            return String.valueOf(x).substring(1);
        }

        return String.valueOf(x);
    }

    private void removeZeroAtFront(final StringBuilder outputBuilder, final boolean isMinus) {
        while (outputBuilder.toString().startsWith("0") && outputBuilder.length() > 1) {
            outputBuilder.deleteCharAt(0);
        }

        if (isMinus) {
            outputBuilder.insert(0, "-");
        }
    }

    private int parseAsInt(final StringBuilder outputBuilder, final boolean isMinus) {
        try {
            return Integer.parseInt(outputBuilder.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}