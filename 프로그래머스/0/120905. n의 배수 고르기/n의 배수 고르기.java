class Solution {
    public int[] solution(int n, int[] numlist) {
        
        // answer 배열의 크기 찾기
        int a = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0) {
                a++;
            }
        }
        
        // n의 배수를 고르고, answer배열에 추가하기
        int[] answer = new int[a]; 
        int k = 0;
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                answer[k] = numlist[i];
                k++;
            }
        }
        
        return answer;
    }
}