import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 학점 * 과목평점
        double aa = 0;
        // 총학점
        double point = 0;

        for (int i = 0; i < 20; i++) {
            // 과목
            String title = scanner.next();
            // 학점
            double a = scanner.nextDouble();
            // 평점
            String b = scanner.next();

            if (b.equals("A+")){
                aa += a * 4.5;
                point += a;
            } else if (b.equals("A0")) {
                aa += a * 4.0;
                point += a;
            }else if (b.equals("B+")) {
                aa += a * 3.5;
                point += a;
            }else if (b.equals("B0")) {
                aa += a * 3.0;
                point += a;
            }else if (b.equals("C+")) {
                aa += a * 2.5;
                point += a;
            }else if (b.equals("C0")) {
                aa += a * 2.0;
                point += a;
            }else if (b.equals("D+")) {
                aa += a * 1.5;
                point += a;
            }else if (b.equals("D0")) {
                aa += a * 1.0;
                point += a;
            }else if (b.equals("F")) {
                aa += a * 0.0;
                point += a;
            }
        }

            System.out.printf("%.6f", aa / point);
    }
}