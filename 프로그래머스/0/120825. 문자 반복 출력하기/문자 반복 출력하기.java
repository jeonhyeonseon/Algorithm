class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        // n번만큼 반복해야하기 때문에 for문 사용
        for(int i = 0; i < my_string.length(); i++){
            // n번을 어떻게 표현할 것인가 -> for문 사용
            for(int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}