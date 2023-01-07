class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        
        int index = 0;
        int total = 0;
        int subTotal = 0;
        
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            subTotal += gas[i] - cost[i];

            if (subTotal < 0) {
                subTotal = 0;
                index = i + 1;
            }
        }

        return total < 0 ? -1 : index;
    }
}