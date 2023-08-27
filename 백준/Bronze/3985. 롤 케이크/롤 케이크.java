import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//첫째줄에 가장 많은 조각을 받을 것으로 기대하고 있던 방청객
		int people1=0;
		int max = 0;
		//둘째 줄에 실제로 가장 많은 조각을 받은 방청객
		int maxSum = Integer.MIN_VALUE;
		int people2=0;
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt(); //롤케이크의 길이
		int N = sc.nextInt(); //방청객의 수
		
		int cake[] = new int[L];
		for(int i=0;i<N;i++) {
			int P = sc.nextInt();
			int K = sc.nextInt();
			int sum = 0;
			if((K-P)>max) {
				max = (K-P);
				people1 = i+1;
			}//가장 많은 조각을 받을 것으로 예상되는 사람
			for(int j=P-1;j<K;j++) {
				if(cake[j]==0) {
					cake[j] = (i+1);
					sum++;
				} //비어있으면 현재 방청객 번호 넣어주기
			}
			if(sum > maxSum) {
				people2 = (i+1);
				maxSum = sum;
			}
		}
		System.out.println(people1);
		System.out.println(people2);
	}
}