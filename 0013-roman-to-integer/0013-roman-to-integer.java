class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int index = 0;
        final int limit = s.length() - 1;

        while (index <= limit) {
            final String c = s.substring(index, Math.min(limit + 1, index + 2));
            final N n = N.getNByC(c);
            sum += n.getV();
            index += n.getC().length();
        }

        return sum;
    }

    public enum N {
        I("I", 1),
        V("V", 5),
        X("X", 10),
        L("L", 50),
        C("C", 100),
        D("D", 500),
        M("M", 1000),
        IV("IV", 4),
        IX("IX", 9),
        XL("XL", 40),
        XC("XC", 90),
        CD("CD", 400),
        CM("CM", 900),
        NONE("NONE", 0),
        ;

        private static final Map<String, N> map;

        static {
            map = Arrays.stream(values())
                    .collect(Collectors.toMap(N::getC, Function.identity()));
        }

        private final String c;
        private final int v;

        N(final String c, final int v) {
            this.c = c;
            this.v = v;
        }

        public String getC() {
            return c;
        }

        public int getV() {
            return v;
        }

        public static N getNByC(final String c) {
            final N n = map.getOrDefault(c, NONE);

            if (NONE != n) {
                return n;
            }

            return map.get(c.substring(0, 1));
        }
    }
}