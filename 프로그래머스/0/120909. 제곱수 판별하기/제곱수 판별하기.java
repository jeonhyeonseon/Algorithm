class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 조건문을 1로 나눈 나머지가 0으로 한 이유 : Math.sqrt가 정수인지 확인하기 위해서
        if(Math.sqrt(n) % 1 == 0) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}