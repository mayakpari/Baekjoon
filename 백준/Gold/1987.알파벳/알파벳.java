import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main{
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] map;
    public static int ans = 0;
    public static boolean[] visited = new boolean[26];
    static int R,C;
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new int[R][C];
        for (int i = 0; i < R; i++) {
            String s = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = s.charAt(j) - 'A';
            }
        }
 
        solve(0, 0, 0);
        System.out.println(ans);
    }
 
    static void solve(int x, int y, int cnt) {
        if (visited[map[x][y]]) {
            ans = Math.max(ans, cnt);
            return;
        } else {
            visited[map[x][y]] = true;
            for (int i = 0; i < 4; i++) {
                int curX = x + dx[i];
                int curY = y + dy[i];
                if (curX >= 0 && curX < R && curY >= 0 && curY < C) {
                	solve(curX, curY, cnt + 1);
                }
            }
            visited[map[x][y]] = false; 
        }
    }
}