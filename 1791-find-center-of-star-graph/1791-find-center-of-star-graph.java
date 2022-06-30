class Solution {
    public int findCenter(int[][] edges) {
        final Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < 2; j++) {
                map.merge(edges[i][j], 1, (a, b) -> a + b);
            }
        }
        
        return map.entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .map(entry -> entry.getKey())
                .collect(Collectors.toList())
                .get(0);
    }
}