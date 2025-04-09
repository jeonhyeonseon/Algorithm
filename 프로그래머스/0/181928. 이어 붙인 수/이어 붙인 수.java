class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        // 정수를 이어붙이려면 문자열로 변환후 값을 구하고 다시 정수로 변환한다.
        String odd = "";
        String even = "";
        
        // 반복문을 통해서 홀수인지 짝수인지 판별 후 이어붙이기
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                even += Integer.toString(num_list[i]);
            } else {
                odd += Integer.toString(num_list[i]);
            }
        }
        
        // 문자열로 바뀐 홀수와 짝수를 다시 정수형으로 변환하여 합하기
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}