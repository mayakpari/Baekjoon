import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            s += s;
 
            if (s.contains(str))
                cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}