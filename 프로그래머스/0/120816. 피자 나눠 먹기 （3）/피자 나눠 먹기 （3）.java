class Solution {
    public int solution(int slice, int n) {
        int pizza = 0; // 피자 개수
        
        if (n % slice == 0) {
            pizza = n / slice;
        } else {
            pizza = n / slice + 1;
        }
        
        return pizza;
    }
}