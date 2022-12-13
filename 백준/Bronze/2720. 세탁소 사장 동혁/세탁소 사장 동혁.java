import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		while(tc-->0) {
			int money = Integer.parseInt(br.readLine());
			
			int q = money/25;
			money = money%25;
			int d = money/10;
			money = money%10;
			int n = money/5;
			money = money%5;
			int p = money;
			
			System.out.println(q+" "+d+" "+n+" "+p);
		}
	}

}