import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[8];
		for(int i=0;i<8;i++) {
			arr[i] = sc.nextInt();
		}
		int upDown = arr[0] - arr[1];
		if(Math.abs(upDown) != 1) {
			System.out.println("mixed");
			return;
		}
		for(int i=1;i<=6;i++) {
			if(arr[i] - arr[i+1] != upDown) {
				System.out.println("mixed");
				return;
			}
		}
		if(upDown == 1) {
			System.out.println("descending");
		}else
			System.out.println("ascending");
	}

}