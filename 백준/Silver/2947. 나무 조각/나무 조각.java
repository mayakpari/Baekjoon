import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 1;
		char[] arr = new char[5];
		String line = br.readLine().replaceAll(" ", "");
		for(int i=0;i<5;i++) {
			arr[i] = line.charAt(i);
		}
		// 배열 순회 중 swap이 일어나는 횟수를 cnt에 저장후 횟수가 0일때 종료
		while(cnt != 0) {
			cnt = 0;
			// 두 자리씩 비교하기 때문에 4번반복한다
			for(int i=0;i<4;i++) {
				// 왼쪽 > 오른쪽 일 경우 위치 변경
				if(arr[i] > arr[i+1]) {
					char tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					// 횟수 ++
					cnt++;
					for(int j=0;j<5;j++) {
						System.out.print(arr[j]+" ");
					}
					System.out.println();
				}
			}
		}
	}

}