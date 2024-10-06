class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            // indexOf사용
            // my_string.charAt(i)의 인덱스 값과 i가 일치한다면
            if(my_string.indexOf(my_string.charAt(i)) == i) {
                // answer에 추가
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}