import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = sc.nextInt();
		n = n/100*100;
		while(true) {
			if(n%f == 0) {
				int a = n%100;
				if(a < 10) {
					System.out.println("0"+a);
				}else
					System.out.println(a);
				return;
			}
			
			n++;
		}
	}

}