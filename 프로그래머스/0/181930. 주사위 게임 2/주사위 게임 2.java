class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum = a + b + c;
        
        // a, b, c 값이 모두 같은 경우
        if(a == b && b == c && c == a) {
            answer = sum * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
          // 두 숫자는 같고 나머지 다른 숫자는 다른 경우
        } else if (a == b || b == c || c == a) {
            answer = sum * (a * a + b * b + c * c);
          // 모두 다른 경우
        } else {
            answer = sum;
        }
        return answer;
    }
}