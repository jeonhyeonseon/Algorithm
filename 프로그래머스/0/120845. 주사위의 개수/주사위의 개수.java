class Solution {
    public int solution(int[] box, int n) {
        // 주사위 길이 : n, 직육면체 상자 길이 : 3(box)
        // (가로 / n) * (세로 / n) * (높이 / n)
        int answer = 0;
        
        answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
        
        return answer;
    }
}