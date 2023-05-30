import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 크로스워드 만들기
// 문자열 처리
public class Main {
	static int x, y;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String a = str.split(" ")[0];
		String b = str.split(" ")[1];
		
		// 같은 문자 인덱스 찾기
		getSameCharIndex(a, b);
		
		// 출력
		print(a, b);
		
	}
	
	// 출력
	static void print(String a, String b) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < b.length(); i++) {
			if(i == y) {
				sb.append(a).append("\n");
				continue;
			}
			
			for(int j = 0; j < a.length(); j++) {
				if(j == x) {
					sb.append(b.charAt(i));
				}
				else {
					sb.append(".");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
	
	// 공통 문자 인덱스 찾기
	static void getSameCharIndex(String a, String b) {
		for(int i = 0; i < a.length(); i++) {
			char aChar = a.charAt(i);
			for(int j = 0; j < b.length(); j++) {
				char bChar = b.charAt(j);
				if(aChar == bChar) {
					x = i;
					y = j;
					return;
				}
			}
		}
	}
}