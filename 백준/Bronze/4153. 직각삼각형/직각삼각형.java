import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		int b = 0;
		int c = 0;
		List<Integer> list = new ArrayList<>();
		while(true) {
			list.clear();
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			if(a+b+c == 0) {
				break;
			}
			list.add(a);
			list.add(b);
			list.add(c);
			Collections.sort(list);
			if(Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2) == Math.pow(list.get(2), 2) ) {
				System.out.println("right");
			}else
				System.out.println("wrong");
		}
	}

}
