class Solution {
    public int solution(int order) {
        int answer = 0;
        
        while (order > 0) {
            int digit = order % 10; // 자릿수 추출
            if(digit == 3 || digit == 6 || digit == 9) {
                answer++;
            }
            // 마지막 자릿수 제거하고 다음 자릿수 확인하기
            order /= 10; 
        }
        return answer;
    }
}