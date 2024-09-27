class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        // str1 안에 str2가 포함되어 있는지 없는지 확인
        if(str1.contains(str2)) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}