import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int t = Integer.parseInt(br.readLine());
		for (int test_case = 0; test_case < t; test_case++) {
			Queue<Integer> que = new LinkedList<>();
			int n = Integer.parseInt(br.readLine());
			int[][] loc = new int[n+2][2];
			boolean[] check = new boolean[n+2];
			StringTokenizer st;
			for (int i = 0; i < n+2; i++) {
				st = new StringTokenizer(br.readLine());
				loc[i][0] = Integer.parseInt(st.nextToken());
				loc[i][1] = Integer.parseInt(st.nextToken());
				
			}
			que.add(0);
            check[0] = true;
			while (que.size() > 0 && !check[n+1]) {
				int idx = que.poll();
				for (int i = 1; i < n+2; i++)
					if (!check[i]) {
						if (Math.abs(loc[idx][0] - loc[i][0])
								+ Math.abs(loc[idx][1] - loc[i][1]) <= 1000) {
							que.add(i);
							check[i] = true;
						}
					}
			}
			
			
			if(check[n+1]) {
				System.out.println("happy");
			}else {
				System.out.println("sad");
			}
		}
	}
 
}