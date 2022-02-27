import java.util.Scanner;
import java.util.Stack;

public class Main{

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int sum = 0;
		for(int i=0;i<K;i++) {
			int tmp = sc.nextInt();
			if(tmp == 0) {
				sum -= st.pop();
			}else
				sum += st.push(tmp);
				
		}
		System.out.println(sum);
	}

}
