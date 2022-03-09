import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int answer = 0;
        List<String> jewelCharacters = Arrays.stream(jewels.split(""))
                                    .collect(Collectors.toList());

        for (String stoneCharacter : stones.split("")) {
            if (jewelCharacters.contains(stoneCharacter)) {
                answer++;
            }
        }

        return answer;
    }
}