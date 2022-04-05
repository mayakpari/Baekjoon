import java.util.Scanner;

public class Main{
	static int n,d,k,c; // 접시수, 초밥가지수, 연속접시수, 쿠폰번호
	static int[] arr,su;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		d = sc.nextInt();
		k = sc.nextInt();
		c = sc.nextInt();
		int[] belt = new int[n];
		int[] eat = new int[d+1];
		for(int i=0;i<n;i++) {
			belt[i] = sc.nextInt();
		}
		
		int total = 0;
		int max = 0;
		
		for(int i=0;i<k;i++) {
			if(eat[belt[i]]==0) {
				total++;
			}
			eat[belt[i]]++;
		}
		
		
		for(int i=1;i<n;i++) {
			if(total>=max) {
				if(eat[c]==0) {
					max = total+1;
				}else
					max = total;
			}
			
			eat[belt[i-1]]--;
			if(eat[belt[i-1]]==0) {
				total--;
			}
			if(eat[belt[(i+k-1)%n]]==0) {
				total++;
			}
			eat[belt[(i+k-1)%n]]++;
		}
		
		System.out.println(max);
	}
	
}
