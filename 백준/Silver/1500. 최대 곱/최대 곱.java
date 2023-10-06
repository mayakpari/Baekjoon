import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt(); // 정수 S
		int K = sc.nextInt(); // 합이 S인 K개의 정수
		int div = S / K; 
		int mod = S % K;
		long max = 1;
		for (int i=1; i<=K; i++) {
			if(i<=mod) { // 나머지 갯수만큼 +1
				max *= (div+1);
			}else {
				max *= div;
			}
		
		}
		System.out.println(max);
	}	
}