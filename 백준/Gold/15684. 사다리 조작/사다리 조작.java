import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

        static int n,m,h;
        static int[][] map;
        static boolean[][] visited;
        static int max;
        static boolean check;

        public static void main (String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());

                n = Integer.parseInt(st.nextToken());
                m = Integer.parseInt(st.nextToken());
                h = Integer.parseInt(st.nextToken());

                map = new int[h+2][n+1];

                for (int i = 0; i < m; i++) {
                        st = new StringTokenizer(br.readLine());
                        map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
                }

                for (int i = 0; i <= 3; i++) {
                        max = i;
                        solve(1,1,0);
                        if(check) break;
                }

                System.out.println(check? max : -1);
        }

        static void solve(int x, int y, int cnt) {
                if(check) return ;

                if(max == cnt) {
                        if(check()) {
                                check = true;
                        }
                        return ;
                }

                for (int i = (y < n ? x : x+1); i <= h; i++) {
                        for (int j = 1; j < n; j++) {
                                if(map[i][j] == 1 || map[i][j-1] == 1 || map[i][j+1] == 1) continue;
                                map[i][j] = 1;
                                solve(i,j,cnt+1);
                                map[i][j] = 0;
                        }
                }

        }

        static boolean check() {
                for (int j = 1; j <= n; j++) {
                        int i = 1;
                        int temp = j;
                        while( i <= h+1) {

                                if(map[i][temp] == 1) {
                                        temp++;
                                }
                                else if(map[i][temp-1] == 1) {
                                        temp--;
                                }
                                i++;
                        }
                        if(j != temp) {
                                return false;
                        }
                }
                return true;
        }

}