class Solution {
    public String solution(String my_string, int num1, int num2) {
        // String을 char 배열로 변환하기
        char[] charArr = my_string.toCharArray();
        // 인덱스 num1자리에 num2 값 대입
        charArr[num1] = my_string.charAt(num2);
        // 인덱스 num2자리에 num1 값 대입
        charArr[num2] = my_string.charAt(num1);
        // char배열을 String 문자열로 변환
        return String.valueOf(charArr);
    }
}