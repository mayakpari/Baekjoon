import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] map =new int[100][100];
		int[][] rec = new int[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				rec[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<4;i++) {
			for(int r=rec[i][0];r<rec[i][2];r++) {
				for(int c = rec[i][1]; c<rec[i][3];c++) {
					if(map[r][c]==0) map[r][c]=1;
				}
			}
		}
		int cnt=0;
		for(int i=0;i<100;i++) {
			for(int j=0;j<100 ;j++) {
				if(map[i][j]==1) cnt+=1;
			}
		}
		
		System.out.println(cnt);
	}
}