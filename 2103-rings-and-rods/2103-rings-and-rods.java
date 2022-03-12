import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countPoints(String rings) {
        Map<Integer, String> rods = new HashMap<>();

        for (int i = 0; i < rings.length(); i += 2) {
            String substring = rings.substring(i, i + 2);
            rods.merge(
                    Integer.valueOf(String.valueOf(substring.charAt(1))),
                    String.valueOf(substring.charAt(0)),
                    (a, b) -> a + b
            );
        }

        return (int) rods.entrySet()
                .stream()
                .filter(entry -> {
                    String value = entry.getValue();
                    return value.contains("R") && value.contains("G") && value.contains("B");
                })
                .count();
    }
}