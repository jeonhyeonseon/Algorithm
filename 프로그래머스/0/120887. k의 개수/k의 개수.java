class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        // k를 문자열로 변환 -> 숫자를 자릿수별로 확인하기 위해서
        String str = String.valueOf(k);
        
        // num은 i부터 j까지의 숫자를 하나씩 나타낸다
        for(int num = i; num <= j; num++) {
            // num을 문자열로 변환
            String numStr = String.valueOf(num);
            // 문자열에서 str가 몇 변 등장하는지 확인하기
            for(int m = 0; m < numStr.length(); m++){
                if(numStr.charAt(m) == str.charAt(0)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}