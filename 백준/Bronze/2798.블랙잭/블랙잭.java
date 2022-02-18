import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] cards,subcard;
	static boolean[] check;
	static int limit,sum,N,max = Integer.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); 
		limit = sc.nextInt();
		cards = new int[N];
		subcard = new int[3];
		check = new boolean[N];
		for(int i=0;i<N;i++) {
			cards[i] = sc.nextInt();
		}
		combine(0,0);
		System.out.println(max);
	}
	
	static void combine(int cnt,int start) {
		if(cnt == 3) { // 3장 다뽑앗으면
			for(int i : subcard) { // 3장합 구한 후
				sum += i;
			}
			if(sum<=limit && sum>max) // 제한을 넘지 않고 현재 max값보다 클경우 max 대입
				max = sum;
			sum = 0;
			return;
		}
		for(int i=start;i<N;i++) {  // 카드 조합
			subcard[cnt] = cards[i];
			combine(cnt+1,i+1);
		}
	}
}