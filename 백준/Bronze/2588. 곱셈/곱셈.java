import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int one = B % 10;
        int ten = (B / 10) % 10;
        int hundred = B / 100;
        
        int three = A * one;
        int four = A * ten;
        int five = A * hundred;
        int total = A * B;
        
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(total);
    }
}