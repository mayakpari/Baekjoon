import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		List<Member> list = new ArrayList<>();
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			list.add(new Member(Integer.parseInt(st.nextToken()),st.nextToken()));
		}
		Collections.sort(list);
		for(int i=0;i<N;i++) {
			System.out.print(list.get(i).age+" "+ list.get(i).name+"\n");
		}
	}

}

class Member implements Comparable<Member>{
	int age;
	String name;
	Member(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public int compareTo(Member m) {
		return this.age - m.age;
	}

}