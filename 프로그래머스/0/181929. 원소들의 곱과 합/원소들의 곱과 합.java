class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        // 원소들의 곱 < 원소들의 합의 제곱 => 1 반환
        // 원소들의 곱 > 원소들의 합의 제곱 => 0 반환
        
        int sum = 0;
        int mul = 1; 
        
        // 반복문을 통해서 원소들의 합과 곱의 결과값을 구하는 식
        for(int i = 0; i < num_list.length; i++){
            sum += num_list[i];
            mul *= num_list[i];
        }
        
        if(sum * sum > mul) {
            answer = 1;
        }
        return answer;
    }
}