import java.io.*;
import java.util.*;

public class Main_16947{
    static int n;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static boolean[] cycle;
    static int[] ans;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        
        // 그래프 초기화
        graph = new ArrayList[n+1];
        for(int i=1; i <= n; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i=0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            
            graph[u].add(v);
            graph[v].add(u);
        }
        visited = new boolean[n+1];
        cycle = new boolean[n+1];
        
        // Cycle 여부 확인 수행
        for(int i=1; i <= n; i++){
            // Cycle이 있다면 추가 반복문 확인을 멈춘다.
            if(isCycle(i, -1, i)){
                break;
                
            // 현재 위치에서 탐색 시 발견 못했다면 다음 탐색 위치에서 시작하도록 하기 위해
            // 방문 배열을 초기화 한다.
            } else {
                visited = new boolean[n+1];
            }
        }
        
        // 모든 정점에서 Cycle 사이의 거리를 구한다.(BFS 활용!)
        ans = new int[n+1];
        bfs();
        
        StringBuilder sb = new StringBuilder();
        for(int i=1; i <= n; i++){
            sb.append(ans[i]).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
    
    // BFS를 활용하여 Cycle과 각 정점 사이의 거리를 계산하는 코드
    private static void bfs(){
        Queue<Integer> q = new LinkedList<>();
        visited = new boolean[n+1];
        for(int i=1; i <= n; i++){
            if(cycle[i]) {
                visited[i] = true;
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int u = q.poll();
            for(int v : graph[u]){
                if(!visited[v]){
                    q.offer(v);
                    visited[v] = true;
                    ans[v] = ans[u]+1; 
                }
            }
        }
    }
    
    // 그래프에 Cycle이 있는지 확인하는 코드
    private static boolean isCycle(int u, int parent, int start){
        visited[u] = true;
        for(int v : graph[u]){
            
            // 현재 정점의 인접 정점의 parent는 현재 정점으로 지정하여 전달함.
            if(!visited[v]){
                if(isCycle(v, u, start)){
                    cycle[v] = true;
                    return true;
                }
                
            // 재귀를 통해 탐색 시, 다음 인접 정점이 현재 정점의 parent가 아니라면
            // 중간이 다른 경로를 통해 방문된 뒤 도착한 것이라서 Cycle이 있는 것
            
            // 최초 시작 위치로 돌아온 경우에 해당 정점들만 Cycle로 처리할 수 있도록 해야 하므로
            // v==start를 추가해야 한다.
            } else if(v != parent && v == start){
                cycle[v] = true;
                return true;
            }
        }
        return false;
    }
}