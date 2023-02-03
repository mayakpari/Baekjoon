import java.util.Scanner;

public class Main {
    public static void main(String[] args)   {
    	Scanner sc = new Scanner(System.in);
    	for(int i = 2992; i<=9999; i++) {
    		int tmp = i;
    		int num1 = 0;
    		int num2 = 0;
    		int num3 = 0;
    		
    		while(tmp != 0) {
    			num1 += tmp%10;
    			tmp /= 10;
    		}
    		tmp = i;
    		while(tmp != 0) {
    			num2 += tmp%12;
    			tmp /= 12;
    		}
    		tmp = i;
    		while(tmp != 0) {
    			num3 += tmp%16;
    			tmp /= 16;
    		}
    		
    		if(num1 == num2 && num2 == num3)
    			System.out.println(i);
    	}
    }
}