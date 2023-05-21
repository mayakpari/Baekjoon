import java.util.Arrays;
import java.util.Scanner;

class Main {
        static int[] sum = new int[1000000];
        static int[] num = new int[1000000];
        static int[] dx = {0, -1, 0, 1};
        static int[] dy = {-1, 0, 1, 0};
        static boolean finish = true;
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                int left = sc.nextInt();
                int right = sc.nextInt();

                int [][]map = new int[n][n];

                for(int i=0; i<map.length; i++){
                        for(int j=0; j<map[0].length; j++){
                                map[i][j] = sc.nextInt();
                        }
                }

                int ans = 0;
                while (finish) {
                        Arrays.fill(sum, 0);
                        Arrays.fill(num, 0);

                        int [][]check = new int[n][n];
                        int index = 1;
                        for(int i=0; i<map.length; i++){
                                for(int j=0; j<map[0].length; j++){
                                        if(check[i][j] == 0){
                                                dfs(map, check, i, j, left, right, index);
                                                index++;
                                        }
                                }
                        }
                        movePerson(map, check, index-1);
                        ans++;
                }
                System.out.println(ans-1);

        }

        private static void movePerson(int[][] map, int[][] check, int index) {
                int cnt = 0;
                for(int i=1; i<=index; i++){
                        if(cnt < num[i]) cnt = num[i];
                        sum[i] = sum[i]/num[i];
                        //System.out.println(sumList[i]);
                }
                for(int i=0; i<check.length; i++){
                        for(int j=0; j<check[0].length; j++){
                                map[i][j] = sum[check[i][j]];
                        }
                }

                if(cnt < 2) finish = false;
        }

        private static void dfs(int[][] map, int[][] check, int x, int y, int left, int right, int index) {
                check[x][y] = index;
                sum[index]+= map[x][y];
                num[index]++;

                for(int i=0; i<4; i++){
                        int nx = x + dx[i];
                        int ny = y + dy[i];
                        if(-1<nx && nx<map.length && -1<ny && ny<map[0].length && check[nx][ny] == 0){
                                int C = Math.abs(map[x][y]-map[nx][ny]);
                                if(left<=C && C<=right){
                                        dfs(map, check, nx, ny, left, right, index);
                                }
                        }
                }

        }

}