import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		for(int t=0;t<test_case;t++) {
			String str = br.readLine();
			System.out.print(str.charAt(0));
			System.out.println(str.charAt(str.length()-1));
		}
	}

}