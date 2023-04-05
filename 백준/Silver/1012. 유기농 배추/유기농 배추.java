import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
	static int m,n,k,x,y;
	static int[][] map;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static boolean[][] check;
	static Queue<carbage> que;
	static class carbage{
		int x;
		int y;

		carbage(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());

		for(int test_case=0;test_case<t;test_case++){
			st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());

			int answer = 0;

			map = new int[m][n];
			check = new boolean[m][n];

			for(int i=0;i<k;i++){
				st = new StringTokenizer(br.readLine());
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
				map[x][y] = 1;
			}

			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					if(map[i][j] == 1){
						map[i][j] = 0;
						solve(i,j);
						answer++;
					}
				}
			}

			System.out.println(answer);
		}

	}

	static void solve(int x, int y){
		que = new LinkedList<>();
		que.offer(new carbage(x,y));
		while(!que.isEmpty()){
			carbage c = que.poll();
			for(int i=0;i<4;i++){
				int nx = c.x + dx[i];
				int ny = c.y + dy[i];
				if(isRange(nx,ny) && map[nx][ny] != 0){
					que.offer(new carbage(nx,ny));
					map[nx][ny] = 0;
				}
			}
		}
	}

	static boolean isRange(int x, int y){
		if(x >= 0 && y >= 0 && x < m && y < n){
			return true;
		}else
			return false;
	}

}	
