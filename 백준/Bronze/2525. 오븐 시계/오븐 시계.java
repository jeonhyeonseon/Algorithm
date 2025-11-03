import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int need = sc.nextInt();
        
        hour = hour + (minute + need) / 60;
        minute = (minute + need) % 60;
        hour = hour % 24;
        
        System.out.println(hour + " " + minute);
    }
}