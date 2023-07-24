import java.util.*;
import java.io.*;
 
public class Main {
    static int N,M;
    static int picture[][] = new int[101][101];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        
        for(int i=0; i<N; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for(int j=x1; j<=x2; j++) {
                for(int k=y1; k<=y2 ; k++) {
                    picture[j][k] += 1;
                }
            }
        }
        
        int ans = 0;
        for(int i=1; i<=100; i++) {
            for(int j=1; j<=100; j++) {
                if(picture[i][j] > M) ans++;
            }
        }
        System.out.println(ans);        
    }
}