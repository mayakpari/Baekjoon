import java.util.Scanner;

public class Main{
	static class light{
		int d;
		int r;
		int g;
		light(int d,int r, int g){
			this.d = d;
			this.r = r;
			this.g = g;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int time = 0;
		int curr = 0;
		light[] lights = new light[n];
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			lights[i] = new light(a,b,c);
		}
		// 신호등 갯수만큼 반복
		for(int i=0;i<n;i++) {
			// 현재위치에서 다음 신호등위치까지 이동
			time += lights[i].d - curr;
			// 현재위치 갱신
			curr = lights[i].d;
			// 현재시간에서 해당신호등의 r+g를 나눈 나머지가 해당신호등의 r유지시간보다 작을경우(= 현재신호등은 빨강색)
			if(time%(lights[i].r+lights[i].g) <= lights[i].r) {
				// 다시 바뀔때까지 대기
				time += lights[i].r - time%(lights[i].r+lights[i].g);
			}
		}
		
		// 마지막 신호등에서부터 끝까지 이동
		time+= l - lights[n-1].d;
		
		System.out.println(time);
	}

}