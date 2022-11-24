import java.util.*;

class Solution {
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};
    public int solution(int[][] maps) {
        int answer = 0;
        int[][] visited = new int[maps.length][maps[0].length];
        bfs(maps,visited);
        answer = visited[maps.length-1][maps[0].length-1];
        if(answer == 0){
            return -1;
        }
        return answer;
    }
    
    
    static void bfs(int[][] map, int[][] visited){
        Queue<bot> que = new LinkedList<>();
        que.add(new bot(0,0));
        visited[0][0] = 1;
        while(!que.isEmpty()){
            bot b = que.remove();
            int x = b.x;
            int y = b.y;
            
            for(int i=0;i<4;i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                
                if(nx >= map.length || ny >= map[0].length || nx < 0 || ny < 0){
                     continue;
                }
                if(visited[nx][ny] == 0 && map[nx][ny] == 1){
                    visited[nx][ny] = visited[x][y] + 1;
                    que.add(new bot(nx,ny));
                }
            }
        }
    }
}

class bot{
    int x;
    int y;
    
    public bot(int x, int y){
        this.x = x;
        this.y = y;
    }
}