import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), k = sc.nextInt(), h = sc.nextInt();
        if(s+k+h >= 100)
            System.out.println("OK");
        else{
            if(s<k && s<h)
                System.out.println("Soongsil");
            else if(k<s && k<h)
                System.out.println("Korea");
            else if(h<s && h<k)
                System.out.println("Hanyang");
        }
    }
}