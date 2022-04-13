import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            int[][] dist = new int[n + 2][n + 2];
            boolean[][] d = new boolean[n + 2][n + 2];
            List<int[]> point = new ArrayList<>();
            for (int i = 0; i <= n + 1; i++)
                point.add(new int[]{sc.nextInt(), sc.nextInt()});

            for (int i = 0; i <= n + 1; i++)
                for (int j = 0; j <= n + 1; j++) {
                    int[] p1 = point.get(i), p2 = point.get(j);
                    dist[i][j] = Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);

                    if (dist[i][j] <= 50 * 20)
                        d[i][j] = true;
                }


            for (int k = 0; k <= n + 1; k++)
                for (int i = 0; i <= n + 1; i++)
                    for (int j = 0; j <= n + 1; j++)
                        if (d[i][k] & d[k][j])
                            d[i][j] = true;

            if(d[0][n+1]) {
            	System.out.println("happy");
            }else
            	System.out.println("sad");
        }
    }

}