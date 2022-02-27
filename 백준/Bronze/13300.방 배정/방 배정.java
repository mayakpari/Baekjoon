import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int room = 0;
		int[][] student = new int[6][2];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());
			int grade = Integer.parseInt(st.nextToken());
			student[grade-1][gender]++;
		}
		for(int i=0;i<6;i++) {
			for(int j=0;j<2;j++) {
				if(student[i][j] == 0)
					continue;
				if(student[i][j] % K == 0) {
					room += student[i][j] / K;
				}else
					room = room + student[i][j] / K + 1;
			}
		}
		System.out.println(room);
	}
}