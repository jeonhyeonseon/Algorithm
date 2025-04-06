class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        // 등차수열 합 : a + (n - 1) * d
        
        for(int i = 0; i < included.length; i++){
            if(included[i] == true) {
                answer += a + (i * d);
            } 
        }
        
        return answer;
    }
}