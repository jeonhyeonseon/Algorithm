class Solution {
    public String solution(String s) {
        // 알파벳의 등장 횟수를 저장할 배열 초기화 (a부터 z까지 26개)
        int[] alphaIndex = new int[26];
        
        // 주어진 문자열을 순회하며 각 알파벳의 등장 횟수를 카운트
        for (char c : s.toCharArray()) {
            alphaIndex[c - 'a']++;  // 'a'를 빼서 알파벳을 0~25 범위로 매핑
        }
        
        // 결과 문자열을 생성하기 위한 StringBuilder 초기화
        StringBuilder sb = new StringBuilder();
        
        // 각 알파벳의 등장 횟수를 확인
        for (int i = 0; i < alphaIndex.length; i++) {
            // 등장 횟수가 1인 알파벳을 결과 문자열에 추가
            if (alphaIndex[i] == 1) {
                sb.append((char)('a' + i));  // 인덱스를 문자로 변환하여 추가
            }
        }
        
        // 결과 문자열 반환
        return sb.toString();
    }
}