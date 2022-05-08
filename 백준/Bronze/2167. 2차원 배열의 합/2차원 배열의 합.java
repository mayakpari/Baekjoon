import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N  = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[][] = new int[N][M];

		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
/*		
		for(int i=0;i<N;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}*/
		
		int K = Integer.parseInt(br.readLine());
//		System.out.println("K :"+K);
		for(int k=0;k<K;k++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int sum = 0;
			for(int m = i-1;m<x;m++) {
				for(int n = j-1;n<y;n++) {
					sum += arr[m][n];
				}
			}
			System.out.println(sum);
		}
	}
}