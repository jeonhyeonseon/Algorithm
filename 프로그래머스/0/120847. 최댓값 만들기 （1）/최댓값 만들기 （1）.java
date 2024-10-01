class Solution {
    public int solution(int[] numbers) {
        int answer = 0; // 결과
        int max = 0; // 최대값
        int index = 0; // 인덱스 최대값
        
        // 최대값과 인덱스 구하기
        for(int i = 0; i < numbers.length; i++){
            if(max < numbers[i]) {
            // 최대값이 여러개라면 첫번째로 나온 최대값을 index로 저장
                max = numbers[i]; // 최대값 저장
                index = i; // 인덱스 저장
            }
        }
        
        // 인덱스를 제외한 최대값을 배열로 곱하기
        for(int i = 0; i < numbers.length; i++){
            // 먼저 나온 최대값을 제외하고 계산하기
            if(i != index && answer < max * numbers[i]){
                answer = max * numbers[i];
            }
        }
        return answer;
    }
}