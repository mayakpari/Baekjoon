import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int 범위를 넘어서서 String으로 받음
        String a = scanner.next();
        
        // 0이 들어오는 경우는 없다하여 0, 00, 000 어떤 형태든 1을 포함하지 않으면 0을 반환하도록 처리했다.
        if(!a.contains("1")) System.out.println("0");
        else{
        	// 1. 2진수를 10진수로 변환한다. → twoToTen 메소드
            // 2. 변환한 10진수와 17을 곱하여 BigInteger로 저장한다. → int 범위 벗어남
            // 3. 17을 곱한 10진수를 다시 2진수로 변환한다.
            BigInteger tenMul17 = twoToTen(a).multiply(BigInteger.valueOf(17));
            String two17 = tenToTwo(tenMul17);
            System.out.println(two17);
        }

    }
    
    // 2진수 -> 10진수
    public static BigInteger twoToTen(String two){
        BigInteger sum = new BigInteger("0"); // 10진수로 변환한 값을 저장할 변수
        BigInteger i = new BigInteger("1");

        while (two.length() != 0) {
            int num = Integer.parseInt(two.substring(two.length() -1)); // 마지막부터 한개씩 int형으로 변환
            sum = sum.add(i.multiply(BigInteger.valueOf(num)));// 1의 자리 수와 i 곱하여 더함
            i = i.multiply(BigInteger.valueOf(2)); // 2진수이기에 i에 2를 곱해줌
            two = two.substring(0, two.length() - 1); // 사용한 1의 자리 지우기
        }
        
        return sum;
    }

    // 10진수 -> 2진수
    public static String tenToTwo(BigInteger ten) {
        StringBuilder binary = new StringBuilder(); // 2진수로 변환한 값 저장할 변수

        while (ten.compareTo(BigInteger.valueOf(0)) == 1) {
            // String binary = (a % 2) + binary;
            binary.insert(0, (ten.remainder(BigInteger.valueOf(2))));
            ten = ten.divide(BigInteger.valueOf(2));
        }
        return binary.toString();
    }
}