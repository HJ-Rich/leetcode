class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int bill : bills) {
            if (bill == 5) {
                map.merge(5, 1, Integer::sum);
                continue;
            }

            if (bill == 10) {
                map.merge(10, 1, Integer::sum);
                map.merge(5, -1, Integer::sum);
                if (map.getOrDefault(5, 0) < 0) {
                    return false;
                }
                continue;
            }

            if (bill == 20) {
                if (map.getOrDefault(10, 0) > 0) {
                    map.merge(10, -1, Integer::sum);
                    bill -= 10;
                }

                while (bill > 5) {
                    map.merge(5, -1, Integer::sum);
                    bill -= 5;
                }

                if (map.getOrDefault(5, 0) < 0) {
                    return false;
                }
            }
        }
        return true;
    }
}