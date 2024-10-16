class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        int a = Integer.parseInt(bin1,2);
        int b = Integer.parseInt(bin2,2);
        
        // 10진수에서 2진수로 바꾸기 toBinaryString
        answer = Integer.toBinaryString(a+b);
        
        return answer;
    }
}