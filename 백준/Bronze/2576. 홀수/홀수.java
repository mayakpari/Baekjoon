import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		int minNum = 0;
		for (int i = 0; i < 7; i++) {
			int num = Integer.parseInt(br.readLine());

			if (num % 2 == 1) {

				if (minNum == 0)
					minNum = num;

				if (minNum > num) {
					minNum = num;
				}
				sum += num;
			}
		}
		if (sum == 0) {
			System.out.println(-1);
			return;
		}
		System.out.println(sum);
		System.out.println(minNum);
	}
}