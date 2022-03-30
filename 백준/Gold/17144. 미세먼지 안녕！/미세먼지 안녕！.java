import java.util.*;
import java.io.*;

class Main {
        static int r, c, t;
        static int[][] arr;
        static List<Integer> cleaner = new ArrayList<>();
        static int dust = 2;

        public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st;
                st = new StringTokenizer(br.readLine());
                r = Integer.parseInt(st.nextToken());
                c = Integer.parseInt(st.nextToken());
                t = Integer.parseInt(st.nextToken());
                arr = new int[r][c];
                for (int i = 0; i < r; i++) {
                        st = new StringTokenizer(br.readLine());
                        for (int j = 0; j < c; j++) {
                                arr[i][j] = Integer.parseInt(st.nextToken());
                                dust += arr[i][j];

                                if (arr[i][j] == -1) {
                                        cleaner.add(i);
                                }
                        }
                }
                while (t > 0) {
                        arr = dustDiffusion();
                        operateAirCleaner();
                        t--;
                }
                System.out.println(Sum());
        }


        static int[][] dustDiffusion() {
                int[][] temp = new int[r][c];
                int[] dx = {-1, 1, 0, 0};
                int[] dy = {0, 0, -1, 1};
                for (int x = 0; x < r; x++) {
                        for (int y = 0 ; y < c; y++) {
                                if (arr[x][y] == -1) {
                                        temp[x][y] = -1;
                                        continue;
                                }
                                temp[x][y] += arr[x][y];
                                for (int i = 0; i < 4; i++) {
                                        int nx = x + dx[i];
                                        int ny = y + dy[i];
                                        if (nx < 0 || nx >= r || ny < 0 || ny >= c) continue;
                                        if (arr[nx][ny] == -1) continue;
                                        temp[nx][ny] += (arr[x][y] / 5);
                                        temp[x][y] -= (arr[x][y] / 5);
                                }
                        }
                }

                return temp;
        }

        static void operateAirCleaner() {
                int up = cleaner.get(0);
                for (int x = up - 1; x > 0; x--) {
                        arr[x][0] = arr[x-1][0];
                }
                for (int y = 0; y < c - 1; y++) {
                        arr[0][y] = arr[0][y+1];
                }
                for (int x = 0; x < up; x++) {
                        arr[x][c-1] = arr[x+1][c-1];
                }
                for (int y = c - 1; y > 1; y--) {
                        arr[up][y] = arr[up][y-1];
                }
                arr[up][1] = 0;

                int down = cleaner.get(1);
                for (int x = down + 1; x < r - 1; x++) {
                        arr[x][0] = arr[x+1][0];
                }
                for (int y = 0; y < c - 1; y++) {
                        arr[r-1][y] = arr[r-1][y+1];
                }
                for (int x = r - 1; x > down; x--) {
                        arr[x][c-1] = arr[x-1][c-1];
                }
                for (int y = c - 1; y > 1; y--) {
                        arr[down][y] = arr[down][y-1];
                }
                arr[down][1] = 0;
        }

        static int Sum() {
                int sum = 2;
                for (int x = 0; x < r; x++) {
                        for (int y = 0; y < c; y++) {
                                sum += arr[x][y];
                        }
                }
                return sum;
        }
}