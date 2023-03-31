import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int n;
    static int[] arr;
    static boolean[] check;
    static List<Integer> list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new int[n+1];
        check = new boolean[n+1];
        list = new ArrayList<>();

        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1;i<=n;i++){
            check[i] = true;
            dfs(i,i);
            check[i] = false;
        }

        Collections.sort(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static void dfs(int start, int end){
        if(!check[arr[start]]){
            check[arr[start]] = true;
            dfs(arr[start],end);
            check[arr[start]] = false;
        }
        
        if(arr[start] == end){
            list.add(start);
        }
    }
}