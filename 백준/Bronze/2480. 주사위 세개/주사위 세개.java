import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int ans = 0;
		for(int i=0;i<3;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		if(arr[0] == arr[1] && arr[1]==arr[2]) {
			ans = arr[0]*1000+10000;
		}else if(arr[0] == arr[1] || arr[1]==arr[2]) {
			ans = arr[1]*100+1000; 
		}else
			ans = arr[2]*100;
		
		System.out.println(ans);
	}

}