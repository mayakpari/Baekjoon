import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N,U,L;

        N = sc.nextInt();
        U = sc.nextInt();
        L = sc.nextInt();

        if(N >= 1000 && (U>=8000 || L >= 260)){
            System.out.println("Very Good");
        }else if(N >= 1000 && (U<=8000 && L <= 260)){
            System.out.println("Good");
        }else{
            System.out.println("Bad");
        }

    }
}