import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	// 로프 길이 순으로 정렬 후 가장긴 로프부터 하나 씩 로프수를 늘려가며 감당가능한 무게를 계산한다(개수*가장작은 로프가 견딜 수 있는 무게)
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] rope = new int[n];
		for(int i=0;i<n;i++) {
			rope[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(rope);
		int max = 0; // 최대감당가능한 무게
		int numOfrope = 0; // 선택된 로프의 수
		int limit = 0; // 현재까지 선택한 로프로 감당가능한 무게
		for(int i=n-1;i>=0;i--) {
			numOfrope++;
			limit = rope[i]*numOfrope;
			if(limit > max) {
				max = limit;
			}
		}
		System.out.println(max);
	}

}
