import java.util.Scanner;

public class Main {
    static double pi = 3.1415927;
    static int mileToFeet = 5280;
    static int feetToInch = 12;
    static int hourToMinute = 60;
    static int MinuteToSec = 60;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 1;
        while (true) {
            double distance = 0;
            double mph = 0;

            double d = sc.nextDouble();
            int c = sc.nextInt();
            double s = sc.nextDouble();

            if (c == 0)
                break;

            distance = (d*pi*c) / (mileToFeet * feetToInch);
            mph = distance* MinuteToSec * hourToMinute / s;
            System.out.println("Trip #" + N + ": " + String.format("%.2f", distance) +
                    " " + String.format("%.2f", mph));
            N++;
        }
        sc.close();
    }
}