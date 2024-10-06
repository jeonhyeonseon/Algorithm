import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        // 문자열 제거 + 배열 생성
        String[] arr = my_string.replaceAll("[a-z]","").split("");
        // 문자열 제거한 배열 길이 생성
        answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            answer[i] = Integer.parseInt(arr[i]);
        }
        
        // 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}