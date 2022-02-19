import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int test_case=0;test_case<T;test_case++) {
			String line = br.readLine();
			int sum=0,score=0;
			for(int i=0;i<line.length();i++) {
				if(line.charAt(i) == 'O') {
					score += 1;
					sum += score;
				}else if(line.charAt(i) == 'X') {
					score = 0;
				}
			}
			
			System.out.println(sum);
		}
	}

}