import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] wine = new int[n];
		int[] DP = new int[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			wine[i] = Integer.parseInt(st.nextToken());
		}

		if (n == 1) {
			System.out.println(wine[0]);
		} else if (n == 2) {
			System.out.println(wine[0] + wine[1]);
		} else {
			DP[0] = wine[0];
			DP[1] = DP[0] + wine[1];
			DP[2] = Math.max(DP[1], Math.max(wine[0] + wine[2], wine[1] + wine[2]));

			for (int i = 3; i < n; i++) {
				DP[i] = Math.max(DP[i - 3] + wine[i] + wine[i - 1], DP[i - 2] + wine[i]);
				DP[i] = Math.max(DP[i - 1], DP[i]);
			}
			System.out.println(DP[n - 1]);
		}

	}

}