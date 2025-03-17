import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        // 1 ≤ str의 길이 ≤ 10 : str.length >= 1 && str.length <= 10
        // 1 ≤ n ≤ 5
        for(int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }
}