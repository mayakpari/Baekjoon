import java.util.*;
public class Main{
	static int n, m;
	static int[][] arr;
	static int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		m = scan.nextInt();
		n = scan.nextInt();
		arr = new int[m][n];
		arr[0][0] = 1;
		int nx = 0, ny = 0;
		int answer = 0;
		int d = 0;
		int temp = 0;
		while(true) {
			 nx = nx + dir[d][0];
			 ny = ny + dir[d][1];
			 if(nx < 0 || ny < 0 || nx >= m || ny >= n || arr[nx][ny] == 1) {
				 nx = nx - dir[d][0];
				 ny = ny - dir[d][1];
				 d = (d + 1) % 4;
				 temp++;
			 }
			 if(temp == 4)
				 break;
			 else if(arr[nx][ny] == 0) {
				 if(temp > 0)
					 answer++;
				 temp = 0;
				 arr[nx][ny] = 1;
			 }
		}
		System.out.println(answer);
	}
}