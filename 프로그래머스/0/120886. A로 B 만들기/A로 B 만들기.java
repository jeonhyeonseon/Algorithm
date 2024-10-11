import java.util.*;

class Solution {
    public int solution(String before, String after) {
        // 알파벳 개수를 셀 배열 초기화 (a-z까지 26개)
        int[] beforeCount = new int[26];
        int[] afterCount = new int[26];
        
        // before 문자열의 각 문자를 순회하며 알파벳 개수를 증가시킴
        for (char c : before.toCharArray()) {
            beforeCount[c - 'a']++;  // 'a'를 빼서 알파벳을 0~25 범위로 매핑
        } 
        
        // after 문자열의 각 문자를 순회하며 알파벳 개수를 증가시킴
        for (char c : after.toCharArray()) {
            afterCount[c - 'a']++;  // 동일하게 'a'를 빼서 0~25 범위로 매핑
        }
        
        // 두 배열이 같은지 비교하여 같으면 1을, 다르면 0을 반환
        if (Arrays.equals(beforeCount, afterCount))
            return 1;
        return 0;
    }
}