import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int cnt = 0;
		for(int i=0;i<3;i++) {
			st = new StringTokenizer(br.readLine());
			cnt = 0;
			for(int j=0;j<4;j++) {
				int a = Integer.parseInt(st.nextToken());
				if(a==0) {
					cnt++;
				}
			}
			switch(cnt) {
			case 0 :
				System.out.println("E");
				break;
			case 1 :
				System.out.println("A");
				break;
			case 2 :
				System.out.println("B");
				break;
			case 3 :
				System.out.println("C");
				break;
			case 4 :
				System.out.println("D");
				break;
			}
		}
	}

}
