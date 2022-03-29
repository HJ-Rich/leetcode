class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        return (int) items.stream()
                    .filter(item -> item.get(getIndexByRuleKey(ruleKey)).equals(ruleValue))
                    .count();
    }
                            
    enum RuleKey {
        TYPE("type", 0),
        COLOR("color", 1),
        NAME("name", 2);
        
        private final String ruleKeyName;
        private final int ruleKeyIndex;
        
        RuleKey(final String ruleKeyName, final int ruleKeyIndex) {
            this.ruleKeyName = ruleKeyName;
            this.ruleKeyIndex = ruleKeyIndex;
        }
        
        public static RuleKey from(final String input) {
            return Arrays.stream(values())
                        .filter(ruleKey -> ruleKey.ruleKeyName.equals(input))
                        .findAny()
                        .orElseThrow(IllegalArgumentException::new);
        }
        
        public int getRuleKeyIndex() {
            return ruleKeyIndex;
        }
    }
                            
    private int getIndexByRuleKey(String ruleKey) {
        return RuleKey.from(ruleKey)
                    .getRuleKeyIndex();
    }
}