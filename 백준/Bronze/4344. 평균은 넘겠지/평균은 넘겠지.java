import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int test_case=1;test_case<=T;test_case++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int sum = 0;
			int[] arr = new int[num];
			for(int i=0;i<num;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				sum+= arr[i];
			}
			int over = 0;
			float avg = (float)sum/num;
			for(int i=0;i<num;i++) {
				if(arr[i]>avg) {
					over++;
				}
			}
			float ans = (float)over/num;
			System.out.println(String.format("%.3f", ans*100)+"%");
		}
	}

}