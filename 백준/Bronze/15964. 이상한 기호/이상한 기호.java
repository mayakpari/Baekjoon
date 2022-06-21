import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        // int sum = (a+b)*(a-b);
        Long sum = a*a - b*b;
        
        System.out.println(sum);
    }
}