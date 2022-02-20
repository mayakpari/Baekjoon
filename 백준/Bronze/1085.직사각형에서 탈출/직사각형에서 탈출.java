import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x,y,w,h;
		x = sc.nextInt();
		y = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		int xmin = Math.min(x,w-x);
		int ymin = Math.min(y, h-y);
		int min = Math.min(xmin, ymin);
		System.out.println(min);
	}

}