import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        while(true){
            a = sc.nextInt();
            b = sc.nextInt();
            if(a+b==0){
                break;
            }
            System.out.println(a+b);
        }
    }
}