class Solution {
    public int solution(int[] box, int n) {
        // n은 주사위의 모서리의 길이로 가로, 세로, 높이의 나머지를 구하여 이들을 곱한다.
        
        int a = box[0] / n; // 가로
        int b = box[1] / n; // 세로
        int c = box[2] / n; // 높이
        
        return a * b * c;
    }
}