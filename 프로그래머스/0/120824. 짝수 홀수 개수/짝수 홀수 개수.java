class Solution {
    public int[] solution(int[] num_list) {
        // for문을 사용해서 배열에 있는 수가 짝수 인지 홀수인지 파악하기. (if문도 사용할 것)
        // 개수를 알아야 하기 때문에 짝수, 홀수 선언하기
        int evenNum = 0; // 짝수 개수
        int oddNum = 0; // 홀수 개수
        int[] answer = new int[2];
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
        }
        
        answer[0] = evenNum;
        answer[1] = oddNum;
        
        return answer;
    }
}