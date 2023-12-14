import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;

        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0;i<n;i++){
            if(arr[i] - i < 0){
                break;
            }
            sum+= arr[i] - i;
        }

        System.out.println(sum);
    }
}
