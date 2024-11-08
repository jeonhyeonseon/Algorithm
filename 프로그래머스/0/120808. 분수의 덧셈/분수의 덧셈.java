class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1; // 분자 계산
        int denom = denom1 * denom2; // 분모 계산

        int max = 1; // 최대공약수 변수 초기화
        
        // 최대공약수 구하기
        for (int i = 1; i <= numer && i <= denom; i++) {
            if (denom % i == 0 && numer % i == 0) {
                max = i;
            }
        }
        
        // 분자와 분모를 최대공약수로 나누어 기약분수 만들기
        numer /= max;
        denom /= max;

        int[] answer = {numer, denom}; // 결과 배열 초기화 및 반환
        return answer;
    }
}
