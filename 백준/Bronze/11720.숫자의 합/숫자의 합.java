import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String line = sc.next();
		int sum = 0;
		for(int i=0;i<line.length();i++) { // 받은 숫자의 자리수만큼 반복
			sum+= line.charAt(i)-'0';  // 각자리수를 int형으로 변환시켜 합산
		}
		System.out.println(sum);
	}

}