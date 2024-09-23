class Solution {
    public int solution(int price) {
        // 신경써야 하는 것 -> 소수점 이하를 버린 정수를 return
        // 큰 금액부터 확인하자 -> 중복이 있을 수 있기 때문이다.
        int answer = 0;
        
        if (price >= 500000) {
        // 50만원 이상인 경우 20%
            answer = (int) (price * 0.8);
        } else if (price >= 300000) {
        // 30만원 이상인 경우 10%
            answer = (int) (price * 0.9);
        } else if (price >= 100000) {
        // 10만원 이상인 경우 5%
            answer = (int) (price * 0.95);
        } else {
            answer = price;
        }
        return answer;
    }
}