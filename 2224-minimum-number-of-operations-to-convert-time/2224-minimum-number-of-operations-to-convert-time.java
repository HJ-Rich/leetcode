class Solution {
    public int convertTime(String current, String correct) {
        int answer = 0;

        int subMin = Integer.parseInt(correct.substring(3)) - Integer.parseInt(current.substring(3));
        int subHour = Integer.parseInt(correct.substring(0, 2)) - Integer.parseInt(current.substring(0, 2));
        if (subMin < 0) {
            subMin += 60;
            subHour -= 1;
        }

        int i1 = subMin / 15;
        subMin -= 15 * i1;
        answer += i1;

        int i2 = subMin / 5;
        subMin -= 5 * i2;
        answer += i2;

        answer += subMin;

        return answer + subHour;
    }
}