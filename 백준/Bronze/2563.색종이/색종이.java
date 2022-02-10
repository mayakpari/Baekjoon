import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int paper = sc.nextInt();
		int[][] map = new int[100][100];
		for(int i=0;i<paper;i++) {
			int side = sc.nextInt();
			int bottom = sc.nextInt();
			for(int j=90-bottom;j<100-bottom;j++) {
				for(int k=side;k<side+10;k++) {
					if(map[j][k] == 0) {
						map[j][k] = 1;
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}

}