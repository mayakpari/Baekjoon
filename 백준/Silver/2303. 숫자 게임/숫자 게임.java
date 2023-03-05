import java.util.*;
 
public class Main {
    static int list[];
 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[5];
        list = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                arr[j] = sc.nextInt();
            }
 
            int max = Integer.MIN_VALUE;
 
            for (int j = 0; j < 3; j++) {
                for (int k = j + 1; k < 4; k++) {
                    for (int z = k + 1; z < 5; z++) {
                        max = Math.max(max, (arr[j] + arr[k] + arr[z]) % 10);
                    }
                }
            }
            list[i] = max;
        }
 
        int idx = -1;
        int res = -1;
 
        for (int i = 0; i < N; i++) {
            if (res <= list[i]) {
                res = list[i];
                idx = i + 1;
            }
        }
 
        System.out.println(idx);
 
        sc.close();
    }
}