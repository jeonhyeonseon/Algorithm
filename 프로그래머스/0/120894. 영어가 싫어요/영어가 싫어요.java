class Solution {
    public long solution(String numbers) {
        // 숫자와 대응되는 문자열 배열
        String[] numArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        // 문자열에서 숫자를 나타내는 문자열을 숫자로 교체
        for (int i = 0; i < 10; i++) {
            // numArr 배열의 각 문자열을 해당 숫자로 교체
            numbers = numbers.replaceAll(numArr[i], "" + i);
        }
        
        // 최종적으로 변환된 숫자 문자열을 long 타입으로 파싱하여 반환
        return Long.parseLong(numbers);
    }
}