import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static int N, M, ans;
	public static boolean[] visited;
	public static List<Integer>[] list;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		visited = new boolean[N];
		list = new ArrayList[N];
		
		for (int i = 0; i < N; ++i) {
			list[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < M; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			// a b == b a 둘다 같은 관계
			list[a].add(b);
			list[b].add(a);
		}
		
		for (int i = 0; i < N; ++i) {
			// 노드 탐색 시작
			solve(i, 1);
			
			// 5개노드 찾았으면 바로 종료
			if (ans == 1) {
				break;
			}
		}
		
		System.out.println(ans);
	}
	
	static void solve(int curr, int cnt) {
		// 방문가능한 5개의 노드를 찾으면 종료
		if (cnt == 5) {
			ans = 1;
			return;
		}
		
		// 현재 노드 방문처리
		visited[curr] = true;
		// 현재 노드와 연결된 노드들을 탐색
		for (int i : list[curr]) {
			// 방문을 안했을 시 다음 방문
			if (!visited[i]) {
				solve(i, cnt + 1);
			}
		}
		// 다음 탐색을 위해 false변경
		visited[curr] = false;
	}
}