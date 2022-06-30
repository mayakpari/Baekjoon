import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double d1 = Double.parseDouble(br.readLine());
		double d2 = Double.parseDouble(br.readLine());
		
		double result = (2 * d1) + (2 * d2 * Math.floor(Math.PI*1000000)/1000000.0);
		
		System.out.println(result);
	}

}