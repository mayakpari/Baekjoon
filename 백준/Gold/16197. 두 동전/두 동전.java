import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int n, m, min = Integer.MAX_VALUE;
	static char[][] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new char[n][m];
		int[][] coin = new int[2][2];
		int c = 0;
		for (int i = 0; i < n; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = tmp.charAt(j);
				if (map[i][j] == 'o') {
					coin[c][0] = i;
					coin[c++][1] = j;
				}
			}
		}

		solve(coin[0][0], coin[0][1], coin[1][0], coin[1][1], 0);
		if (min > 10) {
			System.out.println(-1);
		} else
			System.out.println(min);

	}

	static void solve(int c1x, int c1y, int c2x, int c2y, int idx) {
		// 10회 이상 입력해야 할 경우 종료
		if (idx > 10) {
			return;
		}

		for (int i = 0; i < 4; i++) {
			int nc1x = c1x + dx[i];
			int nc1y = c1y + dy[i];
			int nc2x = c2x + dx[i];
			int nc2y = c2y + dy[i];

			// 둘 다 떨어지면 pass
			if (!isRange(nc1x, nc1y) && !isRange(nc2x, nc2y)) {
				continue;
			}
			// 둘 중 하나만 떨어지면 cnt 갱신 후 종료
			// if (!isRange(c1x, c1y) || !isRange(c2x, c2y)) {
			// 	min = Math.min(min, idx + 1);
			// 	return;
			// }
			if (isRange(nc1x, nc1y) && !isRange(nc2x, nc2y)) {
				min = Math.min(min, idx + 1);
				return;
			}
			if (!isRange(nc1x, nc1y) && isRange(nc2x, nc2y)) {
				min = Math.min(min, idx + 1);
				return;
			}
			// 벽일 경우 다시 원위치
			if (map[nc1x][nc1y] == '#') {
				nc1x = c1x;
				nc1y = c1y;
			}
			if (map[nc2x][nc2y] == '#') {
				nc2x = c2x;
				nc2y = c2y;
			}
			
			solve(nc1x, nc1y, nc2x, nc2y, idx + 1);
		}
	}

	// 범위체크 함수
	static boolean isRange(int x, int y) {
		if (x >= n || y >= m || x < 0 || y < 0) {
			return false;
		}
		return true;
	}
}
