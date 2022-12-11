import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int time = 0;
        while(n!=0){
            cnt++;
            if(n < cnt){
                cnt = 1;
            }
            
            n -= cnt;
            time++;
        }
            
        System.out.println(time);
    }
}