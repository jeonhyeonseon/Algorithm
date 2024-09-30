class Solution {
    public int solution(int n) {
        int answer = 0;
        // 각 자릿수의 합을 구하기 위해서는 각 자리의 수가 무엇인지 알아야한다. -> (n % 10)로 몫을 구하고
        // (n / 10)으로 나머지를 알기
        
        while (n > 0) {
            answer = answer + (n % 10);
            n = n / 10;
        }
        return answer;
    }
}