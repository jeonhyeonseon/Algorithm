class Solution {
    public int solution(int a, int b) {
        
        String ab = Integer.toString(a) + Integer.toString(b);
        
        int val = Integer.parseInt(ab);
        int abVal = 2 * a * b;
        
        if(val > abVal) {
            return val;
        } else {
            return abVal;
        }
    }
}