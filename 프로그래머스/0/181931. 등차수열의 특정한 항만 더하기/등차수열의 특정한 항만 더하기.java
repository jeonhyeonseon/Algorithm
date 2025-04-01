class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        // 등차수열 공식 : n번째 항 = a + (n − 1) * d
        
        for(int i = 0; i < included.length; i++){ // i는 included의 인덱스
            // included[i]가 true일 때 항들만 더한 값 리턴
            if(included[i] == true) {
                answer += a + (i * d);
                continue;
            }
        }
        
        return answer;
    }
}