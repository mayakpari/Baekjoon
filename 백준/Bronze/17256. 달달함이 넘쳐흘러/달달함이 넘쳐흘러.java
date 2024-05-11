import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] a = new int[3];
        int[] b = new int[3];
        int[] c = new int[3];

        // a 케이크 b =  (a.z + b.x, a.y × b.y, a.x + b.z)

        st = new StringTokenizer(br.readLine());

        for(int i = 0;i <3;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());

        for(int i = 0;i <3;i++){
            c[i] = Integer.parseInt(st.nextToken());
        }

        b[0] = c[0] - a[2];
        b[1] = c[1] / a[1];
        b[2] = c[2] - a[0];

        for(int i=0;i<3;i++){
            System.out.print(b[i] + " ");
        }
    }
}
