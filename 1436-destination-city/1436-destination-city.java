class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> cityPaths = new HashMap<>();
        for (List<String> path : paths) {
            cityPaths.put(path.get(0), path.get(1));
        }
        
        return cityPaths.values()
                .stream()
                .filter(destination -> Objects.isNull(cityPaths.get(destination)))
                .findAny()
                .orElse("");
    }
}