class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
                continue;
            }

            if (bill == 10) {
                ten++;
                five--;
                if (five < 0) {
                    return false;
                }
                continue;
            }

            if (bill == 20) {
                if (ten > 0) {
                    ten--;
                    bill -= 10;
                }

                while (bill > 5) {
                    five--;
                    bill -= 5;
                }

                if (five < 0) {
                    return false;
                }
            }
        }
        
        return true;
    }
}