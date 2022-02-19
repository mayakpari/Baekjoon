import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int[] firstIdx = new int[26];
		Arrays.fill(firstIdx, -1);
		int idx = 0;
		for(int i=0;i<word.length();i++) {
			idx = word.charAt(i)-97;
			if(firstIdx[idx] == -1) {
				firstIdx[idx] = i;
			}
		}
		for(int i=0;i<26;i++) {
			System.out.print(firstIdx[i]+" ");
		}
	}

}