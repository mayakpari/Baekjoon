import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int X = scan.nextInt();	// X원
		int Y = scan.nextInt();	// Y그램
		int N = scan.nextInt();	// 편의점 갯수
		double minPrice = (double)X/Y * 1000;	// 1000그램 가격
		
		for(int i=0; i<N; i++) {
			int X1 = scan.nextInt();	// 가격
			int Y1 = scan.nextInt();	// 그램
			double price = (double)X1/Y1 * 1000;
			minPrice = Math.min(minPrice, price);
		}
		
		System.out.println(minPrice);
		scan.close();
	}

}