class Solution {
    public int[] minOperations(String boxes) {
        int[] answer = new int[boxes.length()];

        String[] splitBoxes = boxes.split("");
        for (int i = 0; i < answer.length; i++) {
            answer[i] = getResult(splitBoxes, i);
        }

        return answer;
    }

    private int getResult(String[] boxes, int index) {
        int answer = 0;
        
        for (int i = 0; i < boxes.length; i++) {
            if (i == index) {
                continue;
            }
            answer += Math.abs(index - i) * Integer.parseInt(boxes[i]);
        }
        
        return answer;
    }
}