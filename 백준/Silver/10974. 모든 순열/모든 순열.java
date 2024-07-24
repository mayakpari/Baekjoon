import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static int N;
	private static int arr[];
	private static boolean visit[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		visit = new boolean[N];
		
		dfs(0);
	}
	
	private static void dfs(int cnt) {
		if(cnt == N) {
			for(int i=0;i<N;i++)
				System.out.print(arr[i]+" ");
			System.out.println();
			return ;
		}
		
		for(int i=0;i<N;i++) {
			if(!visit[i]){
                arr[cnt] = i+1;
                visit[i] = true;
                dfs(cnt+1);
                visit[i] = false;
            }
		}
	}

}