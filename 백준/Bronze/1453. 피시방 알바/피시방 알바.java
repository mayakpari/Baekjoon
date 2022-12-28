import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cust = 0;
		int cnt = 0;
		boolean[] seat = new boolean[101];
		for(int i=0;i<num;i++) {
			cust = sc.nextInt();
			if(seat[cust]) {
				cnt++;
			}else {
				seat[cust] = true;
			}
		}
		
		System.out.println(cnt);
	}

}