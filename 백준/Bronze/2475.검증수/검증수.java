import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0;
		for(int i=0;i<5;i++) {
			num[i] = sc.nextInt();
			sum += Math.pow(num[i], 2);
		}
		System.out.println(sum%10);
	}

}