class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        // 마지막 원소와 마지막에서 두번째 원소 값 지정
        int lastNumber = num_list[num_list.length - 1];
        int secondNumber = num_list[num_list.length - 2];
        
        // 배열 복사
        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        if(lastNumber > secondNumber) {
            answer[num_list.length] = lastNumber - secondNumber;
        } else {
            answer[num_list.length] = lastNumber * 2;
        }
        
        return answer;
    }
}