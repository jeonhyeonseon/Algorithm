class Solution {
    public int[][] solution(int[] num_list, int n) {
        // 행의 수 : num_list / n -> 몫
        // 열의 수 : n -> 나머지
        int[][] answer = new int[num_list.length / n][n];
        
        for(int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i];
        }
        
        return answer;
    }
}