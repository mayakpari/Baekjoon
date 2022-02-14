import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] nanjaeng = new int[9];
		int sum = 0;
		for(int i=0;i<9;i++) {
			nanjaeng[i] = sc.nextInt();
			sum += nanjaeng[i];
		}
		outer : for(int i=0;i<8;i++) {
			for(int j=i+1;j<9;j++) {
				if(nanjaeng[i]+nanjaeng[j] == sum-100) {
					nanjaeng[i] = 0;
					nanjaeng[j] = 0;
                    break outer;
				}
			}
		}
		for(int i=0;i<9;i++) {
			if(nanjaeng[i] != 0) {
				System.out.println(nanjaeng[i]);
			}
		}
	}

}