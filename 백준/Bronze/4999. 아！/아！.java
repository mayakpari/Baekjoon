import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jh = sc.next().length();
        int doc = sc.next().length();
        
        String answer = jh >= doc ? "go" : "no";
        
        System.out.print(answer);
    }
}