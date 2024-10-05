class Solution {
    public String solution(int age) {
        // 숫자 0~9를 a~j로 변환
        String alphabet = "abcdefghij";
        
        // 변환된 결과 저장할 StringBuilder객체 생성
        StringBuilder sb = new StringBuilder();
        
        while(age > 0) {
            // age의 마지막 자리 숫자를 알파벳으로 변환하여 삽입하기
            sb.insert(0, alphabet.charAt(age % 10));
            // age를 10으로 나누어 자릿수 제거하기
            age /= 10;
        }
        return sb.toString();
    }
}

