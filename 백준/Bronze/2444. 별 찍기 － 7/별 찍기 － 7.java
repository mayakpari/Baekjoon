import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<cnt;j++){
                System.out.print("*");
            }
            cnt += 2;

            System.out.println();
        }

        cnt-= 2;
        
        for(int i=1;i<n;i++){
            cnt -= 2;

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            for(int j=0;j<cnt;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
