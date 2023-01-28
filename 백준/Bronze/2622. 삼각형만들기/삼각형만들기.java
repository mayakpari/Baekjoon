import java.util.*;
import java.io.*;

public class Main {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 1; 0 < N - i; i++) {
            for (int j = i; j <= N - i - j; j++) {
                int longlong = N - i - j;
                if (i + j > longlong) cnt++;
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
    }
}