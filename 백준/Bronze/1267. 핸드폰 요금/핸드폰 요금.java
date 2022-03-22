import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int youngsik = 0;
		int minsik = 0;
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			int tmp = sc.nextInt();
			youngsik += (tmp/30+1)*10;
			minsik += (tmp/60+1)*15;
		}
		if(youngsik < minsik) {
			System.out.println("Y"+" "+youngsik);
		}else if(youngsik == minsik) {
			System.out.println("Y M "+youngsik);
		}else
			System.out.println("M"+" "+minsik);
	}
}