import java.util.*;
import java.io.*;

class Main {
    static int n;
    static int m;
    static int[][] map;
    static int[][] submap;
    static List<dot> virus = new ArrayList<>();
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int max = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        submap = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2)
                    virus.add(new dot(i, j));
            }
        }
        setWall(0, 0);
        System.out.println(max);
    }

    static void setWall(int start, int depth) {
        if (depth == 3) {
            copyMap();
            for (dot dot : virus) {
                spreadVirus(dot.x, dot.y);
            }
            max = Math.max(max, getSafeArea());
            return;
        }

        for (int i = start; i < n * m; i++) {
            int x = i / m;
            int y = i % m;
            if (map[x][y] == 0) {
                map[x][y] = 1;
                setWall(i + 1, depth + 1);
                map[x][y] = 0;
            }
        }
    }

    static void copyMap() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                submap[i][j] = map[i][j];
            }
        }
    }

    static void spreadVirus(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                if (submap[nx][ny] == 0) {
                    submap[nx][ny] = 2;
                    spreadVirus(nx, ny);
                }
            }
        }
    }

    static int getSafeArea() {
        int safe = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (submap[i][j] == 0)
                    safe++;
            }
        }
        return safe;
    }
}

class dot {
    int x, y;

    public dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}