import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> find = new LinkedList<>();

		int N = sc.nextInt();
		int M = sc.nextInt();
		int ans = 0;

		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt();
			find.add(x);
		}

		while (!find.isEmpty()) {
			int x = find.poll();
			int cnt = 0;
			while (x != q.peek()) {
				int qFront = q.poll();
				q.add(qFront);
				cnt++;
			}
			ans += Math.min(cnt, q.size() - cnt);
			q.poll();
		}
		System.out.println(ans);
	}
}