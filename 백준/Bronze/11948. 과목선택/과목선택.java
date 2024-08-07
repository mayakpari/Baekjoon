import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //택 3
        int A = Integer.parseInt(br.readLine());    //물리
        int B = Integer.parseInt(br.readLine());    //화학
        int C = Integer.parseInt(br.readLine());    //생물
        int D = Integer.parseInt(br.readLine());    //지구과학

        int Sum1 = 0;

        int[] total = new int[] {A, B, C, D};
        Arrays.sort(total);
        Sum1 = total[1]+total[2]+total[3]; // 최대값

        //택 1
        int E = Integer.parseInt(br.readLine());    //역사
        int F = Integer.parseInt(br.readLine());    //지리

        int Sum2 = Math.max(E, F);

        System.out.println(Sum1 + Sum2);
    }
}