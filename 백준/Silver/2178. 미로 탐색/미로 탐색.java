import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	static int[][] map;
	static boolean[][] visited;
	static int N,M,min = Integer.MAX_VALUE;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N][M];
		visited = new boolean[N][M];
		for(int i=0;i<N;i++) {
			String line = sc.next();
			for(int j=0;j<M;j++) {
				map[i][j] = line.toCharArray()[j] - 48;
			}
		}
		solve(0,0);
		System.out.println(map[N-1][M-1]);
	}
	
	
	static void solve(int x, int y) {
		Queue<dot> que = new LinkedList<>();
		que.offer(new dot(0,0));
		visited[0][0] = true;
		while(!que.isEmpty()) {
			dot d = que.poll();
			x = d.x;
			y = d.y;
			for(int i=0;i<4;i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(isMoveable(nx,ny)) {
					que.offer(new dot(nx,ny));
					visited[nx][ny] = true;
					map[nx][ny] = map[x][y]+1;
				}
			}
		}
	}
	static boolean isMoveable(int x, int y) {
		if(x >= 0 && y >= 0 && x < N && y < M && map[x][y] == 1 && !visited[x][y]) {
			return true;
		}
		return false;
	}
}

class dot{
	int x;
	int y;
	dot(int x,int y){
		this.x = x;
		this.y = y;
	}
}