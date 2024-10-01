import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int negativeNum; // 음수 최대값
        int positiveNum; // 양수 최소값
        Arrays.sort(numbers); // 오름차순으로 정렬
        
        negativeNum = numbers[0] * numbers[1]; // 가장 작은 수끼리 곱하기
        positiveNum = numbers[numbers.length - 1] * numbers[numbers.length - 2]; // 가장 큰 수끼리 곱하기
        answer = Math.max(negativeNum, positiveNum);
        return answer;
    }
}