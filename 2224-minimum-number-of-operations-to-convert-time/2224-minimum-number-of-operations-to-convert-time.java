import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Solution {
    public int convertTime(String current, String correct) {
        int answer = 0;
        LocalTime parsedCurrent = LocalTime.parse(current, DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime parsedCorrect = LocalTime.parse(correct, DateTimeFormatter.ofPattern("HH:mm"));

        int subMin = parsedCorrect.getMinute() - parsedCurrent.getMinute();
        int subHour = parsedCorrect.getHour() - parsedCurrent.getHour();
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