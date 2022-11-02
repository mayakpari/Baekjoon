import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int cnt = 0;
		int[] weight = new int[n];
		int[] height = new int[n];
		int[] rank = new int[n];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			weight[i] = Integer.parseInt(st.nextToken());
			height[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<n;i++) {
			cnt = 0;
			for(int j=0;j<n;j++) {
				if(i!=j) {
					if(weight[i] < weight[j] && height[i] < height[j]) {
						cnt++;
					}
				}
			}
			rank[i] = cnt+1;
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(rank[i]+" ");
		}
	}
	
}