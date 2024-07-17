import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    ArrayList<Integer> list = new ArrayList<>(); 

    int a = sc.nextInt();
    double p = sc.nextInt();

    list.add(a);

    while(true) {
      int sum = 0;
      int num = list.get(list.size() - 1);
      int len = Integer.toString(num).length();

      for(int i = 0; i < len; i++) {
        sum += Math.pow(num % 10, p);
        num /= 10;
      }

      if(list.contains(sum)) {
        sb.append(list.indexOf(sum));
        break;
      }

      else list.add(sum);
    }
    
    System.out.println(sb);
  }
}