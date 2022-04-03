import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int money = sc.nextInt();
		int cnt = 0;
		int[] coin = new int[n];
		for(int i=0;i<n;i++) {
			coin[i] = sc.nextInt();
		}
		
		for(int i=n-1;i>=0;i--) {
			if(money >= coin[i]) {
				cnt += money/coin[i];
				money = money%coin[i];
			}
		}
		
		System.out.println(cnt);
	}

}
