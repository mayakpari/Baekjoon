import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum1 = 0;
		int sum2 = 0;
		for(int i=0;i<4;i++) {
			sum1 += sc.nextInt();
		}
		for(int i=0;i<4;i++) {
			sum2 += sc.nextInt();
		}
		
		int ans = (sum1 >= sum2) ? sum1 : sum2;
		System.out.println(ans);
	}
}
