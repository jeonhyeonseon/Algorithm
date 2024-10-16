import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        
        // 먼저 배열을 오름차순으로 정렬한다
        Arrays.sort(array);
        
        // 정답을 저장할 변수, 초기값으로 첫 번째 요소를 저장한다.
        int result = array[0];
        
        // 배열 요소와 n의 차이를 저장하는 변수 (절대값으로 저장해야한다)
        int diff = Math.abs(array[0] - n);  // 0번째 요소의 차이로 초기화하기
        
        // 0번째 요소는 이미 변수로 저장했기 때문에 1부터 시작한다
        for (int i = 1; i < array.length; i++) {
            // 현재 요소와 n의 차이 계산하기
            int currentDiff = Math.abs(array[i] - n);
            
            // 현재 요소가 n에 더 가까운 경우 diff와 result를 갱신하기
            if (currentDiff < diff) {
                diff = currentDiff;
                result = array[i];
            }
        }
        
        return result;
    }
}