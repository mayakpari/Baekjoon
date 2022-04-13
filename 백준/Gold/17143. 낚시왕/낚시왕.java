import java.util.*;
import java.io.*;

public class Main {
        static int r;
        static int c;
        static int m;
        static ArrayList <Shark> list = new ArrayList<>();
        static int[] dx = {-1 ,1, 0, 0};
        static int[] dy = {0, 0, 1, -1};
        static int sum = 0;

        public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());
                r = Integer.parseInt(st.nextToken());
                c = Integer.parseInt(st.nextToken());
                m = Integer.parseInt(st.nextToken());
                int[][] map = new int[r][c];

                for(int i = 0; i < m; i++) {
                        st = new StringTokenizer(br.readLine());
                        int x = Integer.parseInt(st.nextToken()) - 1;
                        int y = Integer.parseInt(st.nextToken()) - 1;
                        int s = Integer.parseInt(st.nextToken());
                        int d = Integer.parseInt(st.nextToken()) - 1;
                        int z = Integer.parseInt(st.nextToken());
                        list.add(new Shark(x, y, s, d, z));
                        map[x][y] = 1;
                }

                for(int i = 0; i < c; i++) {
                        hunt(i, map);
                        move(map);
                }
                System.out.println(sum);
        }


        public static void move(int[][] map) {
                Collections.sort(list);

                for(int i = 0; i < r; i++) {
                        for(int j = 0; j < c; j++) {
                                map[i][j] = 0;
                        }
                }
                int i = 0;
                while(i < list.size()) {
                        Shark s = list.get(i);
                        int nx = s.x;
                        int ny = s.y;
                        int j = 0;
                        while(j < s.s) {
                                nx += s.nx;
                                ny += s.ny;

                                if(nx < 0 || nx >= r) {
                                        s.nx *= -1;
                                        nx += s.nx;
                                }
                                else if(ny < 0 || ny >= c) {
                                        s.ny *= -1;
                                        ny += s.ny;
                                }
                                else j++;
                        }
                        if(map[nx][ny] == 1) {
                                list.remove(i);
                                continue;
                        }

                        map[nx][ny] = 1;
                        s.x = nx;
                        s.y = ny;
                        i++;
                }
        }

        public static void hunt(int y, int[][] sea) {
                for(int i = 0; i < r; i++) {
                        if(sea[i][y] == 1) {
                                for(int j = 0; j < list.size(); j++) {
                                        if(list.get(j).x == i && list.get(j).y == y) {
                                                sum += list.get(j).z;
                                                list.remove(j);
                                                return;
                                        }
                                }
                        }
                }
        }

        public static class Shark implements Comparable<Shark>{
                int x;
                int y;
                int s;
                int nx;
                int ny;
                int z;

                Shark(int x, int y, int s, int d, int z){
                        this.x = x;
                        this.y = y;
                        this.s = s;
                        this.nx = dx[d];
                        this.ny = dy[d];
                        this.z = z;
                }

                @Override
                public int compareTo(Shark s){
                        if(this.z < s.z) return 1;
                        else return -1;
                }
        }
}