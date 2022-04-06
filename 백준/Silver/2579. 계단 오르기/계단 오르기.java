import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stair = new int[n];
		int[] score = new int[n];

		for (int i = 0; i < n; i++) {
			stair[i] = sc.nextInt();
		}
		if (n == 1) {
			System.out.println(stair[0]);
		}
		else if (n == 2) {
			System.out.println(stair[0] + stair[1]);
		} else {
			score[0] = stair[0];
			score[1] = stair[0] + stair[1];
			score[2] = Math.max(stair[0], stair[1]) + stair[2];

			for (int i = 3; i < n; i++) {
				score[i] = Math.max(score[i - 3] + stair[i - 1], score[i - 2]) + stair[i];
			}

			System.out.println(score[n - 1]);
		}
	}

}
