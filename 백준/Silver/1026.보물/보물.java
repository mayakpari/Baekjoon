import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정렬후 한 배열은 처음부터, 나머지 하나의 배열은 뒤에서부터 해서 곱해주면 된다.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		int[] arr1 = new int[N];
		int[] arr2 = new int[N];
		for(int i=0;i<N;i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			arr2[i] = sc.nextInt();
		}
		Arrays.sort(arr1); 
		Arrays.sort(arr2);
		for(int i=0;i<N;i++) {
			ans += arr1[i] * arr2[N-i-1];
		}
		System.out.println(ans);
	}

}