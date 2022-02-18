import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		int ball = 1;
		for(int i=0;i<test_case;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == ball) {
				ball = b;
			}else if(b == ball)
				ball = a;
		}
		System.out.println(ball);
	}

}