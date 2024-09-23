class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int coffee = 5500;
        
        answer[0] = money / coffee; // 살 수 있는 커피의 수
        answer[1] = money % coffee; // 사고 남은 돈
        
        return answer;
    }
}