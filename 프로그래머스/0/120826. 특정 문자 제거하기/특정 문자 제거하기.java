class Solution {
    public String solution(String my_string, String letter) {
        // char.At(0)을 사용해서 letter를 뺴기
        // 그렇다면 for문을 이용해서 letter를 빼야하는게 맞는것인가. 
        // -> for문을 사용하려는 이유 : my_string에 있는 문자열을 알기 위해서...?
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) != letter.charAt(0)) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}