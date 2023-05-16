import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
 
        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= num - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
 
            System.out.println();
        }
        for (int i = num - 1; i >= 1; i--) {
            for (int k = 1; k <= num - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
 
            System.out.println();
        }
    }
 
}
 