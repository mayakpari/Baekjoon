import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] map = new char[8][8];
		for(int i=0;i<8;i++) {
			map[i] = sc.nextLine().toCharArray();
		}
		int cnt = 0;
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if((i+j)%2 == 0 && map[i][j] == 'F') {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}