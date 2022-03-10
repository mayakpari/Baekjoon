import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main{
	static String[][] map;
	static HashSet<String> set;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		set = new HashSet<>();
		String tmp = "";
		map = new String[5][5];
		for(int i=0;i<5;i++) {
			map[i] = br.readLine().split(" ");
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				tmp = "";
				solve(i,j,0,tmp);
				
			}
		}
		System.out.println(set.size());
	}
	
	
	static void solve(int x, int y, int cnt, String tmp) {
		if(cnt == 6) {
			set.add(tmp);
			return;
		}
		for(int i=0;i<4;i++) {
			int nx = x;
			int ny = y;
			if(isRange(nx+dx[i],ny+dy[i])) {
				solve(nx+dx[i],ny+dy[i],cnt+1,tmp+ map[nx+dx[i]][ny+dy[i]]);
			}
		}
	}
	
	static boolean isRange(int x, int y) {
		if(x >= 0 && y>= 0 && x< 5 && y< 5) {
			return true;
		}
		return false;
	}
}