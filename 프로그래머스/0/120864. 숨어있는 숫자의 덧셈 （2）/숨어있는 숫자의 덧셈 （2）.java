class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        // 문자열을 반복하며 각 문자 처리하기
        for(int i = 0; i < my_string.length(); i++){
            // 현재 문자 가져오기
            char c = my_string.charAt(i);
            
            // 현재 문자가 숫자인 경우
            if(c >= '0' && c <= '9') {
                // 숫자를 StringBuilder에 추가
                sb.append(c);
            } 
            // 현재 문자가 숫자가 아닌 StringBuilder에 숫자가 저장된 경우
            else if (sb.length() > 0) {
                // StringBuilder의 숫자를 정수로 변환하여 결과에 추가
                answer += Integer.valueOf(sb.toString());
                // StringBuilder 초기화
                sb.setLength(0);
            }
        }
        
        // 반복이 끝난 후, StringBuilder에 남아 있는 숫자 처리
        if(sb.length() > 0) {
            // 마지막 숫자를 정수로 변환하여 결과에 추가
            answer += Integer.valueOf(sb.toString());
        }
        
        return answer;
    }
}