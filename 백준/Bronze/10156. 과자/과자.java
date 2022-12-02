import java.util.*;

class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
        int price = sc.nextInt();
        int amount = sc.nextInt();
        int money = sc.nextInt();
        int answer = price * amount - money;
          
        if(answer < 0) {
            answer = 0;
        }
        System.out.println(answer);
    }
}