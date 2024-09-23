class Solution {
    public int solution(int n) {
        // n = 피자를 나눠먹을 사람의 수
        // answer = 피자의 조각 수
        int answer = 0;
        
        if(n % 7 == 0){
            answer = n / 7;
        } else {
            // 7로 나누었을 때 나머지가 있을 경우 피자를 추가한다.
            answer = n / 7 + 1;
        }
        return answer;
    }
}