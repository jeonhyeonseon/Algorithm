import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        // concat() : 문자열 붙이기
        String answer = a.concat(b);
        
        System.out.println(answer);
    }
}