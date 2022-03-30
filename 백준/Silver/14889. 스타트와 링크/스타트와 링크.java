import java.util.Scanner;

public class Main{
	static int N,min = Integer.MAX_VALUE;
	static int[][] map;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];
		visited = new boolean[N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		solve(0,0);
		System.out.println(min);
	}
	static void solve(int n, int cnt) {
		// 선수들을 두 팀으로 다 나눈 후
		if(cnt == N/2) {
			// 두 팀의 점수 차이 계산
			int ans = calc();
			// 현재까지의 점수차이 최솟값과 비교
			min = Math.min(min,ans);
			// 차이가 0이면 더이상의 계산 무의미하므로 종료
			if(ans == 0) {
				System.out.println(0);
				System.exit(0);
			}
		}
		// 조합을 이용해 선수를 두 팀으로 나눈다
		for(int i=n;i<N;i++) {
			if(!visited[i]) {
				visited[i] = true;
				solve(i+1,cnt+1);
				visited[i] = false;
			}
		}
	}
	
	static int calc() {
		int start = 0;
		int link = 0;
		
		// 전 인원으로 만들 수 있는 모든 쌍 탐색
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				// 둘 다 start팀 일경우
				if(visited[i] && visited[j]) {
					start += (map[i][j] + map[j][i]);
				}
				// 둘 다 link 팀일 경우
				else if(!visited[i] && !visited[j]){
					link += (map[i][j] + map[j][i]);
				}
			}
		}
		// 점수 차잇값 반환
		return Math.abs(start-link);
	}
}
