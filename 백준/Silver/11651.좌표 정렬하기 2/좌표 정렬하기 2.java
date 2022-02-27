import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		for(int i=0;i<N;i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		Arrays.sort(arr,(o1,o2)->{
			if(o1[1] == o2[1]) {
				return Integer.compare(o1[0], o2[0]);
			}else
				return Integer.compare(o1[1], o2[1]);
		});
		for(int i=0;i<N;i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}

}