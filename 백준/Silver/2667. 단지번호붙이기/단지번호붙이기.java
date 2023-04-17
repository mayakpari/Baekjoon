import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
    static int n;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};
    static char[][] map;
    static boolean[][] isVisited;
    static Queue<dot> que;

    static class dot{
        int x;
        int y;
        dot(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new char[n][n];
        isVisited = new boolean[n][n];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String str = sc.next();
            for(int j=0;j<n;j++){
                map[i][j] = str.charAt(j);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!isVisited[i][j] && map[i][j] == '1'){
                    isVisited[i][j] = true;
                    map[i][j] = '0';
                    list.add(bfs(i,j));
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static int bfs(int x, int y){
        int cnt = 1;
        que = new LinkedList<>();
        que.offer(new dot(x,y));
        while(!que.isEmpty()){
            dot d = que.poll();
            for(int i=0;i<4;i++){
                int nx = d.x + dx[i];
                int ny = d.y + dy[i];
                if(isRange(nx,ny) && !isVisited[nx][ny] && map[nx][ny] == '1'){
                    que.offer(new dot(nx,ny));
                    isVisited[nx][ny] = true;
                    map[nx][ny] = '0';
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static boolean isRange(int x, int y){
        if(x < n && y < n && x >= 0 && y >= 0){
            return true;
        }

        return false;
    }
}
