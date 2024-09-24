class Solution {
    public int solution(String my_string) {
        // my_string에 한자리수(1~9)가 있다면 더하기
        
        // my_string에 있는 소문자, 대문자는 지워야 한다.
        String[] arr = my_string.replaceAll("[^0-9]", "").split("");
        
        int answer = 0;
        
        for(int i = 0; i < arr.length; i++){
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}