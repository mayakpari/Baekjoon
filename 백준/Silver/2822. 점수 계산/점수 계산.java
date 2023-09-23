import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 0)
		int[] score = new int[8];
		int[] arr = new int[3];		// 점수가 낮은 3개를 담을 배열
		int arr_index = 0;
		int sum = 0;
		
		for(int i=0; i<score.length; i++)
			score[i] = scan.nextInt();
		
		// 1)
		int[] score2 = Arrays.copyOf(score, 8);
		Arrays.sort(score2);
		
		// 2)
		for(int i=0; i<3; i++) 
			for(int j=0; j<score.length; j++) 
				if(score2[i] == score[j]) 
					arr[i] = j;
		
		// 3)
		for(int i=0; i<score.length; i++) {
			if(i == arr[0] || i == arr[1] || i == arr[2])
				continue;
			sum += score[i];
		}
		
		// 4)
		System.out.println(sum);
		for(int i=0; i<score.length; i++) {
			if(i == arr[0] || i == arr[1] || i == arr[2])
				continue;
			System.out.print(i+1 + " ");
		}
		
		scan.close();
	}

}