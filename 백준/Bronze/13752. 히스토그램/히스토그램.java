import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int []arr = new int[101];
		
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		
		 for(int i=0;i<num;i++) {
			 for(int j=0;j<arr[i];j++) 
				 System.out.printf("=");
			 System.out.printf("\n");
		 }
		
		sc.close();

	}

}