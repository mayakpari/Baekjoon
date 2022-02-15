import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = new char[str.length()];
		arr = str.toCharArray();
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
	}
}