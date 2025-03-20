class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        int len1 = overwrite_string.length();
        int len2 = my_string.length();
        
        answer = my_string.substring(0, s) + overwrite_string + my_string.substring((len1 + s), len2);
        
        return answer;
    }
}