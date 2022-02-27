import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1;test_case<=T;test_case++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			int floor = 0;
			int num = 0;
			if(N%H == 0) {
				floor = H;
				num = N/H;
			}else {
				floor = N%H;
				num = N/H+1;
			}
			int a = floor*100 + num; 
			System.out.println(a);
			
		}
	}

}