import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        String cut = "";

        for(int i = 0; i < my_str.length(); i++){
            cut += my_str.charAt(i);
            if(cut.length() == n || i + 1 == my_str.length()){
                list.add(cut);
                cut = "";
            }
        }
        
        String[] answer = new String[list.size()];
        
        for(int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
