class Solution {
    public String largestOddNumber(String num) {
        if (Arrays.stream(num.split("")).allMatch(word -> Integer.parseInt(word) % 2 == 0)) {
            return "";
        }

        return subToOdd(num);
    }

    private String subToOdd(String num) {
        if (Integer.parseInt(num.split("")[num.length() - 1]) % 2 != 0) {
            return num;
        }

        return subToOdd(num.substring(0, num.length() - 1));
    }
}