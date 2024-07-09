import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];
        int temp = 0;
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(arr);

        for (int i : arr) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}