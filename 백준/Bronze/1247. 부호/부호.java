import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		BigInteger bi = new BigInteger("0");
		for(int i=0;i<3;i++) {
			n = Integer.parseInt(br.readLine());
			BigInteger bi2 = bi;
			for(int j=0;j<n;j++) {
				BigInteger now  = new BigInteger(br.readLine());
				bi2 = bi2.add(now);
			}
			
			if(bi2.compareTo(bi) == 0) {
				System.out.println(0);
			}else if(bi2.compareTo(bi)==1) {
				System.out.println("+");
				
			}else
			{
				System.out.println("-");
			}
		}
	}

}