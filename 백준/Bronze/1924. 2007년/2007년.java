import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] weeks = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int sum=0;
		
		// 입력으로 주어진 달의 전달까지의 날짜 합
		for(int i=0;i<x-1;i++) {
			sum+=days[i];
		}
		
		// 일수를 합해준다
		sum += y;
		
		
		// 7로 나눴을때 나머지 = 요일 순서(?)
		String week = weeks[sum%7];
		System.out.println(week);
	}

}