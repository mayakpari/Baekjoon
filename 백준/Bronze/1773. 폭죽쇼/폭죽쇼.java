import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int time = sc.nextInt();
		int[] student = new int[n];
		for(int i=0;i<n;i++) {
			student[i] = sc.nextInt();
		}
		int cnt = 0;
		outer : for(int i=1;i<=time;i++) {
			for(int j=0;j<n;j++) {
				if(i%student[j]==0) {
					cnt++;
					continue outer;
				}
			}
		}
		
		System.out.println(cnt);
	}

}