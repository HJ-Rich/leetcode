class Solution {
    public int maximum69Number (int num) {
        final String[] split = String.valueOf(num).split("");
        for (int i = 0; i < split.length; i++) {
            if ("6".equals(split[i])) {
                split[i] = "9";
                break;
            }
        }
        
        return Integer.parseInt(Arrays.stream(split)
                                    .collect(Collectors.joining()));
    }
}