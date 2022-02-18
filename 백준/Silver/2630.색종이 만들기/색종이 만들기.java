import java.util.Scanner;

public class Main{
	static int[][] map;
	static int N;
	static int blue,white;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				map[i][j] = sc.nextInt();
			}
		}
		solve(N,0,0);
		System.out.println(white +"\n"+ blue);
		
	}

	
	static void solve(int size,int x,int y) {
		if(check(size,x,y)) { // 해당 범위가 전부 같은 색으로 이루어져 있는지 검사
			if(map[x][y] == 1) { // 1이면 파란색 0이면 흰색
				blue++;
			}else
				white++;
			return;			 // 해당 재귀 종료
		}
		
		size/= 2; 
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) { // 사분할 후 각각 재귀 탐색
				solve(size,x+i*size,y+j*size);
			}
		}
	}
	
	static boolean check(int size,int x, int y) { // 범위 색 일치 여부 검사 함수
		for(int i=x;i<x+size;i++) {
			for(int j=y;j<y+size;j++) {
				if(map[x][y] != map[i][j])
					return false;
			}
		}
		return true;
	}
}