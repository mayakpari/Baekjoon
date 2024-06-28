import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String AB = sc.nextLine();
		sc.close();

		if (AB.contains("1010")) {
			System.out.println(20);
		} else if (AB.contains("10")) {
			AB = AB.replaceAll("10", ""); //10이 있으면 그걸 비워주고 남은 숫자를 AB로 받는다.
			System.out.println(10 + Integer.parseInt(AB));
		} else {
			String[] arr = AB.split("");
			System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
		}
	}

}