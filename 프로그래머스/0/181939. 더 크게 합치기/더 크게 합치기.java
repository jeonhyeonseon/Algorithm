class Solution {
    public int solution(int a, int b) {
        
        // a와 b의 합 = ab
        String ab = Integer.toString(a) + Integer.toString(b);
        // b와 a의 합 = ba
        String ba = Integer.toString(b) + Integer.toString(a);
        
        // ab와 ba를 int로 변환하여 더 큰 값 출력
        int abVal = Integer.parseInt(ab);
        int baVal = Integer.parseInt(ba);
        
        return Math.max(abVal, baVal);
    }
}