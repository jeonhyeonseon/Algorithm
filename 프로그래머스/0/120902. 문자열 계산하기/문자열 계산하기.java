class Solution {
    public int solution(String my_string) {
        // 문자열을 공백을 기준으로 분리하여 배열로 저장
        String[] strArr = my_string.split(" ");
        // 첫 번째 숫자를 초기 결과값으로 설정
        int result = Integer.parseInt(strArr[0]);
        
        // 연산자에 따라 연산할 값을 저장할 변수
        int operand = 0;
        for (int i = 1; i < strArr.length; i++) {
            // 피연산자 처리
            if (i % 2 == 0) {
                // 연산자에 따라 피연산자를 곱하고 결과에 더함
                operand *= Integer.parseInt(strArr[i]);
                result += operand;
            }
            // 연산자가 "+"인 경우
            else if (strArr[i].equals("+")){
                operand = 1; // 양수로 설정
            }
            // 연산자가 "-"인 경우
            else {
                operand = -1; // 음수로 설정
            }
        }
        return result;
    }
}