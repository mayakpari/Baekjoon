import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int plusTime = sc.nextInt();
        hour = (hour + (minute+plusTime)/60)%24;
        minute = (minute+plusTime)%60;
        System.out.println(hour+" "+minute);
    }
}