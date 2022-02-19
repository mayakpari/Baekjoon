import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int test_case=0;test_case<T;test_case++) {
			st = new StringTokenizer(br.readLine());
			int cnt = Integer.parseInt(st.nextToken());
			String line = st.nextToken();
			for(int i=0;i<line.length();i++) {
				for(int j=0;j<cnt;j++) {
					System.out.print(line.charAt(i));
				}
			}
			System.out.println();
		}

	}

}