import java.util.Scanner;

public class Main {
	static int[] Find_LeapYear(String string_year){	
		int year = Integer.parseInt(string_year);
		int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(year%400==0||(year%4==0 && year%100!=0))
			month[2]=29;
		return month;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] tmp = sc.nextLine().split(" ");
		
		int[] monthArr= Find_LeapYear(tmp[2]);
		
		String[] month_name = {"0","January","February","March","April","May","June",
				"July","August","September","October","November","December"};
		int month=0;
		for(int i=1;i<month_name.length;i++) {
			if(tmp[0].equals(month_name[i]))
				month=i;
		}
		
		int date = Integer.parseInt(tmp[1].substring(0,2));
		
		String[] split=tmp[3].split(":");
		int hour = Integer.parseInt(split[0]);
		int minute = Integer.parseInt(split[1]);
		
		int sum_date=0;
		for(int i=1;i<month;i++) {
			sum_date+=monthArr[i];
		}
		sum_date+=date-1;
		
		sum_date=sum_date*1440;		
		
		int sum_hour=hour*60;
		
		int Sum = sum_date+sum_hour+minute;
		
		
		if(monthArr[2]==28) {
			System.out.println((double)Sum/(double)525600*100);
		}
		else
			System.out.println((double)Sum/(double)527040*100);
		
		

	}

}