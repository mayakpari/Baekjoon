import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int input;
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			input = sc.nextInt();
			if(!list.contains(input)) {
				list.add(input);
			}
		}
		
		Collections.sort(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}

}