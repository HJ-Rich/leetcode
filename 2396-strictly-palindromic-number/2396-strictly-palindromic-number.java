class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n - 2; i++) {
            if (!isPalindrome(convertByBase(n, i))) {
                return false;
            }
        }

        return true;
    }

    private String convertByBase(final int n, final int base) {
        final var nums = new ArrayList<Integer>();
        var num = n;

        while (num > 0) {
            nums.add(num % base);
            num /= base;
        }

        return nums.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    private boolean isPalindrome(final String s) {
        var f = 0;
        var b = s.length() - 1;

        while (b > f) {
            if (s.charAt(f) != s.charAt(b)) {
                return false;
            }

            f++;
            b--;
        }

        return true;
    }
}
