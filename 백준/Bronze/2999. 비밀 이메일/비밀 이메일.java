import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		//입력 받은 글자를 세기
		int N=s.length();
		
		int r = 0, c = 0,rf = 0 ,cf =0;
		int max = 0;
		
		for (cf = 1; cf <= N; cf++) {
			for (rf = 1; rf <= cf; rf++) {
				if(cf * rf == N ) {
					if(r < rf) {
						r = rf;
						c = cf;
					}
				}
			}
		}
		int index =0;
		char[][] arr = new char[c][r];
		//행 열에 입력 받기 열 0 행 1 2 3 4 
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				arr[i][j] = s.charAt(index);
				index++;
			}
		}
		// 출력하기 행 0 열 1 2 3 4
		for (int j = 0; j < r; j++) {
			for (int i = 0; i < c; i++) {
				System.out.print(arr[i][j]);
			}
		}
		
	}

}