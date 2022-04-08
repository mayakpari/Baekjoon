import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        static int n;
        static int[][] map;
        static int[][] submap;
        static int[] way;
        static int max;
        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                max=0;
                n = Integer.parseInt(br.readLine());
                map = new int[n][n];
                way = new int[5];
                for(int i=0; i<n; i++) {
                        String[] s = br.readLine().split(" ");
                        for(int j=0; j<n; j++) {
                                map[i][j]=Integer.parseInt(s[j]);
                        }
                }
                dfs(5,0);
                System.out.println(max);
        }

        static int[] dx = {0,0,-1,1};
        static int[] dy = {1,-1,0,0};
        static void dfs(int end, int index) {
                if(index==end) {
                        check();
                        return;
                }
                for(int i=0; i<4; i++) {
                        way[index]=i;
                        dfs(end,index+1);
                }
        }
        static boolean[][] visited;
        private static void check() {
                submap = new int[n][n];
                for(int i=0; i<n; i++) {
                        for(int j=0; j<n; j++) {
                                submap[i][j]=map[i][j];
                        }
                }
                for(int k=0; k<way.length; k++) {
                        visited = new boolean[n][n];
                        if(way[k]==0) {
                                for(int i=n-1; i>=0; i--) {
                                        for(int j=0; j<n; j++) {
                                                simulation(i,j,way[k]);
                                        }
                                }
                        }else if(way[k]==1) {
                                for(int i=0; i<n; i++) {
                                        for(int j=0; j<n; j++) {
                                                simulation(i,j,way[k]);
                                        }
                                }
                        }else if(way[k]==2) {
                                for(int j=0; j<n; j++) {
                                        for(int i=0; i<n; i++) {
                                                simulation(i,j,way[k]);
                                        }
                                }
                        }else if(way[k]==3) {
                                for(int j=n-1; j>=0; j--) {
                                        for(int i=0; i<n; i++) {
                                                simulation(i,j,way[k]);
                                        }
                                }
                        }
                }
                for(int i=0; i<n; i++) {
                        for(int j=0; j<n; j++) {
                                if(submap[i][j]>max) {
                                        max=submap[i][j];
                                }
                        }
                }
        }
        private static void simulation(int y, int x, int k) {
                if(submap[y][x]==0) return;
                while(true) {
                        int rx = dx[k]+x;
                        int ry = dy[k]+y;
                        if(ry<0||rx<0||ry>=n||rx>=n) return;
                        if(visited[ry][rx]) return;
                        if(submap[ry][rx]==submap[y][x]) {
                                visited[ry][rx]=true;
                                submap[ry][rx]*=2;
                                submap[y][x]=0;
                                return;
                        }else if(submap[ry][rx]!=0) return;
                        submap[ry][rx]=submap[y][x];
                        submap[y][x]=0;
                        y=ry;
                        x=rx;
                }
        }
}