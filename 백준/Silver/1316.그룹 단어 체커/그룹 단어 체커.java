import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int cnt=num;

		for(int c = 0;c<num;c++) {
			String st = sc.next();
			boolean test[] = new boolean[26];

			for(int i=0;i<st.length()-1;i++) {
				if(st.charAt(i)!=st.charAt(i+1)) {
					if(test[st.charAt(i+1)-97]==true) {
						cnt--;
						break;
					}
				}
				test[st.charAt(i)-97]=true;
			}
		}
		System.out.println(cnt);
	}
}

