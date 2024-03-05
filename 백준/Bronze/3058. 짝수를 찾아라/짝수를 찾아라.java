import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int caseNum = scanner.nextInt();
    int[] data = new int[7];

    for(int i = 0; i < caseNum; i++) {
      int sum = 0;
      int min = 101;
      for(int j = 0; j < 7; j++) {
        data[j] = scanner.nextInt();

        if((data[j] % 2) == 0) {
          sum += data[j];
          if(data[j] < min) {
            min = data[j];
          }
        }
      }
      System.out.println(sum + " " + min);
    }
  }
}