import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_16935 {
	static int[][] map;
	static int N,M,R;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		int[] command = new int[R];
		int cmd = 0;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<R;i++) {
			cmd = Integer.parseInt(st.nextToken());
			switch(cmd) {
			case 1 :
				upDown();
				break;
			case 2 :
				leftRight();
				break;
			case 3 :
				right();
				break;
			case 4 :
				left();
				break;
			case 5 :
				partRight();
				break;
			case 6 :
				partLeft();
				break;
			}
				
		}
		for(int i=0;i<N;i++) {  //최종 배열 출력
			for(int j=0;j<M;j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	static void upDown() {  // 상반 하반 변경
		int[][] tmpMap = new int[N][M];
		for(int i=0;i<N;i++) {  // 기존배열 요쇼를 행조절 하여 tmpMap에 저장
			for(int j=0;j<M;j++) {
				tmpMap[N-i-1][j] = map[i][j];
			}
		}
		map = tmpMap;
	}
	static void leftRight() {// 좌반 우반 변경
		int[][] tmpMap = new int[N][M];
		for(int i=0;i<N;i++) {   // 기존배열 요쇼를 열조절 하여 tmpMap에 저장
			for(int j=0;j<M;j++) {
				tmpMap[i][M-j-1] = map[i][j];
			}
		}
		map = tmpMap;
	}
	static void right() {  // 우측 90도 회전
		int[][] tmpMap = new int[M][N];
		for(int i=0;i<M;i++) {  // 기존배열 한 행씩 회전시켜 tmpMap에 저장
			for(int j=0;j<N;j++) {
				tmpMap[i][j] = map[N-j-1][i];
			}
		}
		int tmp = M;
		tmp = N;
		N = M;
		M = tmp;   // 행 수, 열 수 전환
		map = tmpMap;  
	}  
	static void left() {  //좌측 90도 회전
		int[][] tmpMap = new int[M][N];
		for(int i=0;i<M;i++) {  // 기존배열 한 행씩 회전시켜 tmpMap에 저장
			for(int j=0;j<N;j++) {
				tmpMap[i][j] = map[j][M-i-1];
			}
		}
		int tmp = M;
		tmp = N;
		N = M;
		M = tmp;  // 행 수, 열 수 전환
		map = tmpMap;
	}
	static void partRight() {  //4분할 후 우측 회전
		int[][] tmpMap = new int[N][M]; 
		int halfN = N/2;
		int halfM = M/2;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {  // 기존 배열 돌면서 분면 확인 후 tmpMap상에서의 이동할 분면에 저장
				if(i<halfN && j>=halfM) { // 1사분면
					tmpMap[i+halfN][j] = map[i][j];
				}else if(i<halfN && j<halfM) {  // 2사분면
					tmpMap[i][j+halfM] = map[i][j];
				}else if(i>=halfN && j<halfM) {   // 3사분면
					tmpMap[i-halfN][j] = map[i][j];
				}else if(i>=halfN && j>=halfM) {   // 4사분면
					tmpMap[i][j-halfM] = map[i][j];
				}
			}
		}
		map = tmpMap;
	}
	static void partLeft() {  //4분할 후 좌측 회전
		int[][] tmpMap = new int[N][M];
		int halfN = N/2;
		int halfM = M/2;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {  // 기존 배열 돌면서 분면 확인 후 tmpMap상에서의 이동할 분면에 저장
				if(i<halfN && j>=halfM) { // 1사분면
					tmpMap[i][j-halfM] = map[i][j];
				}else if(i<halfN && j<halfM) {  // 2사분면
					tmpMap[i+halfN][j] = map[i][j];
				}else if(i>=halfN && j<halfM) {   // 3사분면
					tmpMap[i][j+halfM] = map[i][j];
				}else if(i>=halfN && j>=halfM) {   // 4사분면
					tmpMap[i-halfN][j] = map[i][j];
				}
			}
		}
		map = tmpMap;
	}
}
