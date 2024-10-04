import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        // 소문자
        String[] str = my_string.toLowerCase().split("");
        // 정렬
        Arrays.sort(str);
        
        for(int i = 0; i < str.length; i++){
            answer += str[i];
        }
        return answer;
    }
}