class Solution {
    public int solution(int[] box, int n) {
        
        int a = box[0] / n; // 가로
        int b = box[1] / n; // 세로
        int c = box[2] / n; // 높이
        
        return a * b * c;
    }
}