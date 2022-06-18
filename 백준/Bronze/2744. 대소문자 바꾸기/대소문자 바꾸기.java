import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		
		String s=scan.nextLine(); //문자열 입력받기
		String res=""; //결과값 저장
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)<91) //대문자인지 확인
			res+=s.toLowerCase().charAt(i);
			
			else res+=s.toUpperCase().charAt(i); 
		}
		
		System.out.println(res);
	}

}