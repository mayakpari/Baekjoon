import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long sum = 0;
		int cnt = 0;
		
		for(int i=1;;i++) {
			if(sum>a) {
				break;
			}
			sum+=i;
			cnt++;
		}
		
		System.out.println(cnt-1);
	}

}