import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        final long accountSum = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).sum();

        final long doubleChickenPrice = Long.parseLong(br.readLine()) * 2;

        long sol = accountSum;
        if (accountSum >= doubleChickenPrice) {
            sol = accountSum - doubleChickenPrice;
        }

        System.out.print(sol);
    }
}