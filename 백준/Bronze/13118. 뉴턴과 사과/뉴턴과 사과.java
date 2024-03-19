import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int person[] = new int[4];
        int apple[] = new int[3]; // x,y,r

        st = new StringTokenizer(br.readLine());

        for(int i=0;i<4;i++){
            person[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        int idx = 0;

        while(st.hasMoreTokens()){
            apple[idx++] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;

        for(int i=0;i<4;i++){
            if(person[i]==apple[0]){
                ans = i+1;
                break;
            }
        }

        System.out.println(ans);
    }
}
