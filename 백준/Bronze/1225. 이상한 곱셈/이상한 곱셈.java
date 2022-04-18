import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		long ans = 0;
		long tmp = 0;
		char[] n = a.toCharArray();
		char[] m = b.toCharArray();
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<m.length;j++) {
				tmp = (n[i]-'0') * (m[j]-'0');
				ans += tmp;
			}
		}
		System.out.println(ans);
	}

}