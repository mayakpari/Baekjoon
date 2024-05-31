import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
    static int N;
    static ArrayList<String>[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new ArrayList[N];
        int result = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = new ArrayList<>();
            String str = br.readLine();
            for(int j=0; j<str.length(); j++){
                arr[i].add(str.substring(j)+ str.substring(0,j));
            }

            boolean chk = true;
            for (int j = 0; chk && j <= i-1; j++) {
                for (int k = 0; chk && k < arr[j].size(); k++) {
                    if (str.equals(arr[j].get(k))) chk = false;
                }
            }
            if (chk)
                result++;
        }

        System.out.println(result);
    }
}