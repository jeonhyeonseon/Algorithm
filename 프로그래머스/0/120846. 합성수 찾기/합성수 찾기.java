class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // i를 j로 나누었을 때 나머지가 0이 되는 수마다 count를 1씩 증가시키기
        for(int i = 1; i <= n; i++) {
            int count = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }
            // count가 3이상일 때 answer 1씩 증가
            if(count >= 3) {
                answer++;
            }
        }
        return answer;
    }
}