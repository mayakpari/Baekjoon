import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] t = new long[n];
		for(int i=0;i<n;i++) {
			t[i] = sc.nextLong();
		}
		long max = Integer.MIN_VALUE;
		Arrays.sort(t);
		if(n%2 == 0) {
			for(int i=0;i<n/2;i++) {
				max = Math.max(max, t[i]+t[n-i-1]);
			}
		}else {
			for(int i=0;i<n/2;i++) {
				max = Math.max(max, t[i]+t[n-i-2]);
			}
			Math.max(max, t[n-1]);
		}
		
		System.out.println(max);
	}
	
}
