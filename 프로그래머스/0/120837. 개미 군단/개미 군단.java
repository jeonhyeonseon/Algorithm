class Solution {
    public int solution(int hp) {
        /**
        * 장군개미 5
        * 병정개미 3
        * 일개미 1
        **/ 
        int answer = 0;
        int a = hp / 5; // 장군개미를 구하고 나머지
        int b = (hp % 5) / 3; // 병정개미를 구하고 나머지
        int c = (hp % 5) % 3; // 일개미
        
        return answer = a + b + c;
    }
}