class Solution {
    public int solution(int[] sides) {
        int result = 0;
        int min = Math.min(sides[0], sides[1]);
        int max = Math.max(sides[0], sides[1]);
        
        // 주어진 변의 길이 중 하나가 가장 긴 변일 때 가능한 세 번째 변의 수를 더하기
        result += max - (max - min + 1);
        
        // 주어지지 않은 변이 가장 긴 변이 될 때 가능한 세 번째 변의 수를 더하기
        result += (max + min) - max;
        
        // 최종적으로 가능한 모든 변의 길이 경우의 수
        return min * 2 - 1;
    }
}