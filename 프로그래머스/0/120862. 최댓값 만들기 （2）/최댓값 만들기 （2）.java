import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int mNum; // 음수 최대값
        int pNum; // 양수 최소값
        Arrays.sort(numbers); // 오름차순으로 정렬
        
        mNum = numbers[0] * numbers[1]; // 가장 작은 수끼리 곱하기
        pNum = numbers[numbers.length - 1] * numbers[numbers.length - 2]; // 가장 큰 수끼리 곱하기
        answer = Math.max(mNum, pNum);
        return answer;
    }
}