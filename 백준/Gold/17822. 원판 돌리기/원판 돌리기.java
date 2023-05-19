import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
        static int n,m,t;
        static int[][] map;
        static boolean[][] visited;
        static boolean check;
        static int[] dx = { -1, 0, 1, 0 };
        static int[] dy = { 0, 1, 0, -1 };

        public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());
                n = Integer.parseInt(st.nextToken());
                m = Integer.parseInt(st.nextToken());
                t = Integer.parseInt(st.nextToken());
                map = new int[n][m];

                for (int i = 0; i < n; i++) {
                        st = new StringTokenizer(br.readLine());
                        for (int j = 0; j < m; j++) {
                                map[i][j] = Integer.parseInt(st.nextToken());
                        }
                }

                for (int i = 0; i < t; i++) {
                        st = new StringTokenizer(br.readLine());
                        int x = Integer.parseInt(st.nextToken());
                        int d = Integer.parseInt(st.nextToken());
                        int k = Integer.parseInt(st.nextToken());
                        rotate(x, d, k);
                }

                int result = 0;
                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                                if (map[i][j] != -1) {
                                        result += map[i][j];
                                }
                        }
                }
                System.out.println(result);
        }

        static void rotate(int x, int d, int k) {
                int x2 = x;
                while (x2 - 1 < n) {
                        if (d == 0) {
                                for (int j = 0; j < k; j++) {
                                        int temp = map[x2 - 1][m - 1];
                                        for (int i = m - 1; i >= 1; i--) {
                                                map[x2 - 1][i] = map[x2 - 1][i - 1];
                                        }
                                        map[x2 - 1][0] = temp;
                                }
                        } else if (d == 1) {
                                for (int j = 0; j < k; j++) {
                                        int temp = map[x2 - 1][0];
                                        for (int i = 0; i < m - 1; i++) {
                                                map[x2 - 1][i] = map[x2 - 1][i + 1];
                                        }
                                        map[x2 - 1][m - 1] = temp;
                                }
                        }
                        x2 += x;
                }

                check = false;
                visited = new boolean[n][m];
                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                                if (!visited[i][j] && map[i][j] != -1) {
                                        check(i, j, map[i][j]);
                                }
                        }
                }

                if (!check) {
                        update();
                }
        }

        static void update() {
                int sum = 0;
                int cnt = 0;
                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                                if (map[i][j] != -1) {
                                        sum += map[i][j];
                                        cnt++;
                                }
                        }
                }

                float avg = (float) (sum) / cnt;
                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                                if (map[i][j] != -1) {
                                        if (map[i][j] < avg) {
                                                map[i][j] += 1;
                                        } else if (map[i][j] > avg) {
                                                map[i][j] -= 1;
                                        }
                                }
                        }
                }
        }

        static void check(int x, int y, int val) {
                visited[x][y] = true;
                for (int i = 0; i < 4; i++) {
                        int px = x + dx[i];
                        int py = y + dy[i];

                        if (py < 0) {
                                py = m - 1;
                        } else if (py >= m) {
                                py = 0;
                        }

                        if (0 <= px && px < n) {
                                if (!visited[px][py] && map[px][py] == val) {
                                        check = true;
                                        map[x][y] = -1;
                                        map[px][py] = -1;
                                        check(px, py, val);
                                }
                        }

                }

        }
}