import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String orign = br.readLine();
            if (!orign.equals("END"))  { 
                StringBuffer sb = new StringBuffer(orign).reverse(); 
                System.out.println(sb);
            } else
                break;

        }
    }
}