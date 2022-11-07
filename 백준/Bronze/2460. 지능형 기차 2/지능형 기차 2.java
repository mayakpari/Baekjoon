import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int max = 0;
		int person = 0;
		for(int i=0;i<10;i++) {
			st = new StringTokenizer(br.readLine());
			int minus = Integer.parseInt(st.nextToken());
			int plus = Integer.parseInt(st.nextToken());
			
			person -= minus;
			person += plus;
			if(max < person) {
				max = person;
			}
		}
		
		System.out.println(max);
	}

}
