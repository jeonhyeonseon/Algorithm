import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] array = new int[score.length];
        for(int i = 0; i < score.length; i++) {
            array[i] = score[i][0] + score[i][1];
        }
        
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int rank = 1;
        
        for (int i = sortedArray.length - 1; i >= 0; i--) {
            if (!map.containsKey(sortedArray[i])) {
                map.put(sortedArray[i], rank);
            }
            rank++;
        }
        
        for(int i = 0; i < array.length; i++) {
            answer[i] = map.get(array[i]);
        }
        
        return answer;
    }
}