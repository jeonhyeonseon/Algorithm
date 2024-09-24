class Solution {
    public int[] solution(int[] array) {
        // 인덱스는 0부터 시작
        // for문을 통해서 가장 큰 수의 값 찾기 -> 인덱스 값까지
        // array[0] = 가장 큰 수
        // array[1] = 그 수의 인덱스
        int[] answer = new int[2];
        
        for(int i = 0; i < array.length; i++){
            if(array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}