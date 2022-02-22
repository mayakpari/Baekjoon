import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for(int i=0;i<N;i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr,new Comparator<String>() { // comparator 재정의
			@Override
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) { // 길이가 같으면 문자열 비교
					return s1.compareTo(s2);
				}else
					return s1.length() - s2.length(); // 길이가 다를경우 짧은 것을 앞으로
			}
		});
		
		System.out.println(arr[0]); // 첫번째 값 출력 후
		for(int i=1;i<arr.length;i++) { // 다음 값부터 전 인덱스와 비교후 다를경우만 출력
			if(arr[i-1].equals(arr[i])) {
				continue;
			}
			System.out.println(arr[i]);
		}
	}

}