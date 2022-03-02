import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        return Arrays.stream(operations)
                .map(string -> string.contains("--") ? -1 : 1)
                .mapToInt(Integer::valueOf)
                .sum();
    }
}