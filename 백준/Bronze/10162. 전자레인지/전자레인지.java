import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int aButton = 300;
		int bButton = 60;
		int cButton = 10;
		
		int a = time/300;
		time -= a*aButton;
		
		int b = time/60;
		time -= b*bButton;
		
		int c = time/10;
		time -= c*cButton;
		
		if(time == 0) {
			System.out.print(a+" "+b+" "+c);
		}else
			System.out.println(-1);
	}
}