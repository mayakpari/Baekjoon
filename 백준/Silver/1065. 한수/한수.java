import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		int count = 0; 
		for (int i = 1; i <= num; i++) { 
			if (i <= 99) { 
				count += 1;
			} else if (i <= 999) { 
				String[] num_str = Integer.toString(i).split(""); 
				if ((Integer.parseInt(num_str[1]) - Integer.parseInt(num_str[0])) == (Integer.parseInt(num_str[2])- Integer.parseInt(num_str[1]))) { //백의자리 십의자리 일의자리를 각각 a, b, c라고 생각하고 b-a == c-b 이면 한수이므로 +1
					count += 1;
				}
			}
		}
		System.out.println(count);
	}
}