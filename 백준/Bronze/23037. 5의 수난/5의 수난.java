import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int sum = 0;
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			sum += five(ch[i]-'0');
		}
		
		System.out.println(sum);
	}
	
	
	static int five(int n) {
		int a = n;
		
		for(int i=0;i<4;i++) {
			a *= n;
		}
		
		return a;
	}
}