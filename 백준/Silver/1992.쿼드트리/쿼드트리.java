import java.util.Scanner;

public class Main{
	static int[][] map;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		map = new int[N][N];
		for(int i=0;i<N;i++) {
			String line = sc.next();
			for(int j=0;j<N;j++) {
				map[i][j] = line.charAt(j) - '0';
			}
		}
		solve(0,0,N);
		
	}
	
	static void solve(int x, int y, int size) {
		
		if(check(x,y,size)) {
			System.out.print(map[x][y]);
			return;
		}
		
		
		size /= 2;
		System.out.print("(");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				solve(x+i*size,y+j*size,size);
			}
		}
		System.out.print(")");
	}
	
	static boolean check(int x, int y,int size) {
		boolean check = true;
		outer : for(int i=x;i<size+x;i++) {
			for(int j=y;j<size+y;j++) {
				if(map[x][y] != map[i][j]) {
					check = false;
					break outer;
				}
			}
		}
		return check;
	}
}
