import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int num = sc.nextInt();
		int k = sc.nextInt();
		for(int i=1;i<=num;i++) {
			list.add(i);
		}
		System.out.print("<");
		int cnt = -1;
		while(!list.isEmpty()) {
			cnt+=k;
			if(cnt>=list.size()) {
				while(cnt>=list.size())
					cnt -= list.size();
			}
			if(list.size()==1) {
				System.out.print(list.get(cnt));
			}else
				System.out.print(list.get(cnt)+", ");
			list.remove(cnt);
			cnt--;
		}
		System.out.print(">");
	}
}