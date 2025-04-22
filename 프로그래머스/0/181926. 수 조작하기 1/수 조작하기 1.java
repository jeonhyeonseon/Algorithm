class Solution {
    public int solution(int n, String control) {
        
        // 반복문을 통해 인덱스값이 어떤 문자열인지 확인하고 덧셈 또는 뺄셈을 한다.
        for(int i = 0; i < control.length(); i++){
            char controlChar = control.charAt(i);
            if(controlChar == 'w') {
                n = n + 1;
            } else if(controlChar == 's') {
                n = n - 1;
            } else if(controlChar == 'd') {
                n = n + 10;
            } else {
                n = n - 10;
            }
        }
        return n;
    }
}