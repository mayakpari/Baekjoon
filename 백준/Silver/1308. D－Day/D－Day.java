import java.util.Scanner;

public class Main{
	// 윤년인지 판단할 메소드
	static int[] dayArray(int year) {
		int[] day = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			day[1] = 29;
		return day;
	}

	// 1년1월1일~ 해당 날짜 까지의 날짜 수를 합할 메소드
	static long FindingDays(int year, int month, int day) {
		long days = 0;
		int[] date;
		for (int i = 1; i < year; i++) {
			date = dayArray(i);
			for (int j = 0; j < 12; j++) {
				days += date[j];
			}
		}
		date = dayArray(year);
		for (int i = 0; i < month-1; i++) {
			days += date[i];
		}
		days += day;
		return days;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 오늘의 날짜
		int Tyear = sc.nextInt();
		int Tmonth = sc.nextInt();
		int Tday = sc.nextInt();
		// D-Day인 날의 날짜
		int Dyear = sc.nextInt();
		int Dmonth = sc.nextInt();
		int Dday = sc.nextInt();

		// gg를 칠지 판단
		if ((Dyear - Tyear > 1000) || (Dyear - Tyear == 1000 && Dmonth > Tmonth)
				|| (Dyear - Tyear == 1000 && Dmonth == Tmonth && Dday >= Tday))
			System.out.println("gg");
		else {
			long T_findingdays = FindingDays(Tyear, Tmonth, Tday);
			long D_findingdays = FindingDays(Dyear, Dmonth, Dday);
			System.out.println("D-" + (D_findingdays - T_findingdays));
		}

	}

}