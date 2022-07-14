import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String num = sc.next();
			int size = 0;
			if (num.equals("0")) {
				break;
			}
			char[] ch = num.toCharArray();

			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == '1') {
					size += 2;
				} else if (ch[i] == '0') {
					size += 4;
				} else {
					size += 3;
				}
			}
			size += ch.length + 1;
			System.out.println(size);
		}
	}

}